# TODO-Liste

## Prüfungsleistung
-TODO-Listen Anwendung mit Java+Swing (auch möglich:
Spring)
-Vererbung, Persistenz
-Übungsaufgaben (20%, siehe übernächste Folie)
-Eigenständiges Projekt in 2er-Gruppen
-Gruppen bis 28.5. per E-Mail melden
-Beginn 1.6., Abgabe Beleg bis 22.6. 23:59 Uhr in OPAL
(“Abgabeordner”)

## Spezifikation TODO Listen App
Die TODO-App soll mehrere TODO-Listen verwalten können. Jede
TODO-Liste hat einen Titel. Listen können weiterhin entweder
Fließtext sein (Musskriterium), oder (Wunschkriterium 1) aus einer
Reihe von Einträgen mit Checkbox bestehen. Die abgehakten
Checkbox-Einträge werden an das Ende der Liste sortiert, sobald
die Checkbox aktiviert wurde und anders dargestellt (z.B.
Durchgestrichen, andere Farbe, …).
Wunschkriterium 2: Die App speichert alle Einträge persistent, d.h.
bei Wiederaufruf nach Beenden sind alle vergangenen Einträge
wieder sichtbar

## Bewertungskriterien
-Entwickler-Dokumentation (20%)
    -JavaDoc, readthedocs…
    -Erklärung der wichtigsten Funktionen (mit Text, ganze Sätze)
    -Klassendiagramm
-Programmierung und Funktionalität (60%)
    -Codestruktur, Codeumfang, Lesbarkeit
    -Umsetzung und Funktionalität
-Musskriterien: 30%
-Je Wunschkriterium 15%
-Übung 20%

## Betriebsanleitung
### Programmstart
Das Programm kann mit einem Doppelklick auf die JAR-Datei geöffnet werden. Alternativ geht dies auch
in der Commandozeile im Projektordner mit folgenden Befehl. Es wurde für Java 21 kompiliert.

java -cp TODO-Liste.jar todo.Main

Die Quelltextdateien befinden sich im Projektordner unter "src/todo". Die Main.java ist für den
Programmstart zuständig.

### Bedienung und Funktionen
Die TODO-Liste dient zur Verwaltung einfacher Aufgaben.
Die wichtigsten Funktionen sind hier kurz erläutert. 
Die Dokumentation wurde mit Javadoc gemacht und ist unter dem gleichnamigen Ordner zu finden.
Auch im Programm ist sie unter "Datei --> Hilfe" aufrufbar.
Zusätzlich liegt im Dateiordner ein Klassendiagramm als PDF oder PNG vor, die zugehörige JAR-Datei kann
ebenso aus dem Ordner heraus gestartet werden.

Wenn das Programm zum ersten Mal gestartet wurde, so ist der Arbeitsbereich leer. Alle
Funktionen sind grundsätzlich über die Menubar aufrufbar.

"Datei":
- "Hilfe" öffnet die Javadoc-HTML im Browser
- "Beenden" schließt das Programm

"Neues Item"
- "Neue Aufgabe" erstellt eine neue Aufgabe mit Checkbox
- "Neue Notiz" erstellt ein Textfeld, in welches man frei hineinschreiben kann. Passt der
Text nicht hinein, hilft eine Scrollbar beim Scrollen.

"Kategorien managen"
- "Neue Kategorie" erstellt einen neuen Tab, der über die untere Leiste ausgewählt wird. Angezeigt werden nur die
Aufgaben und Notizen, die in dieser Kategorie erstellt wurden.
- "Aufgaben nach Status sortieren" sortiert die Aufgaben von oben nach unten anhand ihres Status', also ob eine
Aufgabe abgehakt/erledigt wurde oder nicht. Notizen werden als nicht erledigt/offen angesehen. Da diese Option nicht
gewünscht war, sortiert das Programm automatisch sekündlich die Aufgaben und diese Option ist auskommentiert.
- "Aktuelle Kategorie löschen" löscht die gesamte Kategorie und alle Aufgaben, die darin enthalten sind.

Auch die Aufgaben haben ein paar Funktionen.
- Bei jeder Aufgabe und Notiz kann der Text jederzeit geändert werden.
- Aufgaben können über eine Checkbox ausgewählt werden. Sie gelten dann als erledigt, bzw. abgehakt und werden grau
eingefärbt. Bei Notizen ist die Auswahl nicht verfügbar und gilt als offen/nicht erledigt. Intern wird der Zustand Status genannt.
-Jede Aufgabe kann über den "x"-Button gelöscht werden. Es gibt keine Nachfrage und die Aufgabe oder Notiz ist dauernhaft und nicht
widerufbar gelöscht.

### Hinweise:
Es wird immer die aktuell ausgewählte Kategorie behandelt. Die Kategorie kann über die untere Leiste ausgewählt werden.

Um eine Aufgabe oder Notiz erstellen zu können, muss eine Kategorie erstellt worden sein, da wie eben erwähnt immer
in der aktuell ausgewählten Kategorie operiert wird. Wird das Programm das erste Mal gestartet, gibt es keine voreingestellte
Kategorie. Der Arbeitsbereich ist leer.

Werden mehr Aufgaben oder Notizen erstellt, als in das Fenster passen, erscheint wie bei den Notizen eine Scrollbar, mit der die unteren
Aufgaben oder Notizen angesehen werden können.

Als Kriterium der Prüfung wurde erwähnt, dass die abgehakten Aufgaben ans Ende der Liste sortiert werden.
Wir haben uns bewusst dagegen entschieden und dafür eine Funktion implementiert, die dies manuell erledigt (s. Bedienung und Funktionen).
Die Übersicht ging bei langen Listen schnell verloren, besonders wenn die Aufgaben in einer bestimmten Reihenfolge erstellt worden sind.
Da diese Lösung aber nicht gewünscht war, übernimmt die Stoppuhr die automatische Sortierung sekündlich aber trotzdem.

### Speichern
Das Programm speichert sämtliche Aufgaben oder Notizen im Sekundentakt automatisch ab. Die Speicherdatei nennt sich "save.dat"
und befindet sich immer im selben Ordner des Programms. Dies kann je nach Umgebung möglicherweise abweichen.
Wird die "save.dat" gelöscht, so sind auch alle Aufgaben und Notizen verloren. Bei einem Neustart des Programms wird
entsprechend eine neue "save.dat" erstellt.

Gespeichert werden nur die Eigenschaften der Aufgaben bzw. Notizen und das Programm erstellt daraus den Arbeitsbereich. Es gehen keine
Informationen verloren. Das hat allerdings zur Folge, dass leere Kategorien nach einem Neustart gelöscht werden!

Die "save.dat" wird nur bei Programmstart aufgerufen, woraus das Programm dann die jeweiligen Aufgaben und Notizen im
Arbeitsbereich wiederherstellt und rekonstruiert. Danach wird die "save.dat" nur zum Speichern des aktuellen Stands verwendet
und während des Betriebs nicht wieder geladen.


