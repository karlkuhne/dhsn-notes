---
tags:
  - sem2
  - ooe
type: exercise
date: 2026-05-07
updated: 2026-05-07
---
**08.05.26**

## 2.1 Erwärmung 1: Vererbung vs. Komposition

> [!info] Aufgabe: Kategorisieren Sie die folgenden Beziehungen als Vererbung (Ist-ein) oder Komposition (Hat-ein):

- **Küche und Toaster**: Komposition
- **Toaster und Küchengerät**: Vererbung
- **Koch und Messer**: Komposition
- **Vegane Mahlzeit und Mahlzeit**: Vererbung
- **Kühlschrank und Kompressor**: Komposition

## 2.2 Erwärmung 2: Fernbedienung

Stellen Sie sich vor, es gibt ein Interface `FernBedienbar` (`RemoteControllable`).

> [!info] Nennen Sie drei sehr unterschiedliche Dinge, die das Interface implementieren würden, vielleicht je eines aus dem Haushalt, aus einer Fabrik, aus einer Webapplikation.

Das Interface `FernBedienbar` bedient verschiedene Klassen von:
- Smart-Lampen (Haushalt)
- Türen (Drehtür, Schiebetür, Tore - Fabrik)
- Interface reload / Component remount (Webapplikation)

> [!info] Was wären Methoden, die alle Dinge, die Fernbedienbar sind, gemeinsam haben?

- `toggle()`
- `bewegen()` / `action()`

## 2.3 Smart-Home Refactoring

Ein Junior-Entwickler stellt dieses Klassendiagramm vor. Es funktioniert, scheint aber nicht ganz richtig zu sein. Seine Idee: Ein `Heater` muss wie ein `Thermometer` die Temperatur messen können, und zusätzlich auch das Einstellen erlauben. Das `SmartLight` muss wie seine Oberklasse eine Verbindung zum WLAN herstellen, und zusätzlich die Helligkeit steuern können.

![[2-smart-home-refactoring.jpeg]]

> [!warning] Kritik am Entwurf
> Warum ist `Heater` als Spezialisierung von `Thermometer` gefährlich? Macht es Sinn, wenn z.B. eine Methode `calibrate(Thermometer t)` mit einem `Heater` als Parameter aufgerufen wird (was syntaktisch legal ist)?

- **Liskovsches Substitutionsprinzip (LSP):** Ein `Heater` ist kein `Thermometer`. Wenn eine Methode ein `Thermometer` erwartet, um es zu kalibrieren, könnte ein `Heater` fälschlicherweise wie ein reines Messgerät behandelt werden, obwohl er aktiv die Umgebung beeinflusst. Vererbung sollte nur bei einer echten "Ist-ein"-Beziehung genutzt werden.

> [!tip] Refactoring: Delegation statt Vererbung
> Ändern Sie das Design und verwenden Sie Delegation statt Vererbung zur Funktionserweiterung. Skizzieren Sie, wie ein `Heater` ein `Thermometer` benutzt, ohne selbst eines zu sein!

Ein `Heater` sollte ein Attribut vom Typ `Thermometer` besitzen (Komposition/Delegation), um die Temperatur zu prüfen, anstatt die Funktionalität durch Vererbung zu erzwingen.

> [!info] Interface "Serviceable"
> Fügen Sie ein Interface `Serviceable` hinzu (Funktion: `reportStatus()`). Wo passt das hin?
> - Das Interface kann von allen Smart-Home-Geräten (`Heater`, `SmartLight`, `Thermometer`) implementiert werden, um einen einheitlichen Statusbericht zu ermöglichen.

## 2.4 Late-Binding vs. Early-Binding

```java
class Alpha {
    void print (Object o) { System.out.println ("Alpha-Obj"); }
    void show() { System.out.println("Alpha-Show"); }
}

class Beta extends Alpha {
    void print (String s) { System.out.println ("Beta-String"); }
    @Override void show() { System.out.println("Beta-Show"); }
}

// Execution code
Alpha item = new Beta();
Object msg = "Hello";
String text = "World";

// Console Logs
item.show();
item.print(msg);
item.print(text);
```

> [!info] Was ist die Konsolenausgabe?

```text
Beta-Show
Alpha-Obj
Alpha-Obj
```

> [!info] Analyse der Bindung
> Wann (Laufzeit / Compilezeit) wurde in jeder Zeile die Entscheidung getroffen, welcher Code ausgeführt wird?

1. **`item.show()`**: Laufzeit (Late-Binding), da die Methode in `Beta` überschrieben wurde (`@Override`).
2. **`item.print(msg)`**: Kompilierzeit (Early-Binding), da Overloading (Überladen) statisch aufgelöst wird.
3. **`item.print(text)`**: Kompilierzeit, da der statische Typ von `item` `Alpha` ist und `Alpha` nur `print(Object)` kennt.

> [!info] Änderung auf `Beta item = new Beta();`
> Was passiert jetzt bei `item.print(text)`?
> - Ausgabe: `Beta-String`. Da der statische Typ nun `Beta` ist, wird die passendere Methode `print(String)` beim Kompilieren gewählt.

## 2.5 Payment-System

Sie sollen das Payment-System, `CheckoutManager`, für einen Onlineshop entwerfen. Momentan wird nur `CreditCard` unterstützt.

1. **Erweiterung:** Wie würden Sie das System um eine neue Zahlungsweise, `PayPal`, erweitern?
   - Einführung eines Interfaces oder einer abstrakten Klasse `PaymentMethod`.
2. **Abstraktion:** Wie kann der `CheckoutManager` eine Zahlung veranlassen, ohne zu wissen, welches Zahlungsmittel verwendet wird?
   - Durch Polymorphie: Der Manager ruft `paymentMethod.pay(amount)` auf.
3. **UML-Diagramm:**
![[2-payment-system-uml.jpeg]]

## 2.6 Typensicherer Frachter

Ein Frachter hat mehrere Frachtzonen. Wir wollen verhindern, dass nicht versehentlich ein `Biohazard` in einer `NahrungsmittelZone` einsortiert wird.

- **Aufgabe 1:** Entwerfen Sie die Klasse `FrachtZone<T>`.
- **Aufgabe 2:** Entwerfen Sie ein Interface `Verderblich` (`getExpirationDate()`) und ändern Sie `FrachtZone` so, dass es nur Typen akzeptiert, die dieses Interface implementieren.

```java
// Beispielhafte Umsetzung
interface Verderblich {
    Date getExpirationDate();
}

class FrachtZone<T extends Verderblich> {
    private List<T> items = new ArrayList<>();
    
    public void add(T item) {
        items.add(item);
    }
}
```
