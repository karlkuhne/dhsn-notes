package todo;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Die Aufgabe repräsentiert eine Todo im Programm.
 * Eine Aufgabe hat drei Objekte: eine Checkbox, ein Textfeld und einen Button
 * zum Löschen. Statt einem Textfeld kann es auch eine Textarea haben. <br>
 * Außerdem ist der zugehörige Tab gespeichert.
 * <p>
 * Daneben hat eine Aufgabe auch mehrere Parameter, den Text der Aufgabe, den
 * Status, den Typ der Aufgabe und das Label.
 * Der Status gibt zurück, ob die Aufgabe schon erledigt wurde oder nicht. <br>
 * Der Typ speichert die Art der Todo, ob es eine klassische Aufgabe zum Abhaken ist
 * oder eine einfache Notiz. Anhand des Typs haben sie andere Erscheinungsbilder. <br>
 * Das Label dient dazu, die Oberkategorie bzw. den Tab zuzuordnen, besonders dann, wenn
 * die Aufgabe gespeichert wird, da nur diese Attribute der Aufgabe gespeichert werden.
 * <p>
 * Attributliste
 * Die Attributliste wird zum Speichern benötigt und stellt quasi die Bündelung
 * aller Attribute der jeweiligen Aufgabe dar.
 */

public class Aufgabe {

    //Komposition/Aggregation
    public Checkbox checkbox;
    public Textfeld textfeld;
    public Textarea textarea;
    public ButtonLoeschen buttonLoeschen;
    public Tab zugehoerigerTab;

    //Attribute
    public List<String> attribute = new ArrayList<>();  //zum Speichern aller Werte nötig, wie Art Päckchen
    public String text = "Neue To-Do";
    public boolean status = false;
    public String typ = "Aufgabe";
    public String kategorie = "unkategorisiert";

    /**
     * Wird eine Aufgabe erstellt, wird zuerst ein Typ erzeugt. Dieser sorgt dafür, dass sich die Aufgabe erstmal in die
     * aufgabenliste einträgt, damit sie dann später von der GUI auch berücksichtigt werden kann 
     * und auf dem Bildschirm erscheint. Wurden Werte
     * übergeben, so werden diese mit dem anderen Konstruktor verwendet, ansonsten werden auf die Standardwerte zurückgegriffen.
     * <p>
     * Das eigentliche Erstellen und somit visuelle Erscheinen auf dem Bildschirm passiert erst im nächsten Schritt.
     */
    
    //Konstruktor
    public Aufgabe() {

        // Zugriff auf das aktuell sichtbare Tab-Objekt
        Component ausgewaehlterTab = GUI.tabbedPane.getSelectedComponent(); // Gibt die sichtbare JScrollPane zurück

        //Geht durch die Tabliste durch und schaut, ob der Tab zu der gerade ausgewählten Ebene gehört
        for (Tab tab : GUI.tabliste) {
            if (tab.scrollPane == ausgewaehlterTab) {
                this.zugehoerigerTab = tab;
                break;
            }
        }

        this.kategorie = GUI.tabbedPane.getTitleAt(GUI.tabbedPane.getSelectedIndex()); //ordnet dem Label zu, wo Aufgabe gerade drin ist

        //speichere die Liste mal ab
        GUI.aufgabenliste.add(this);
    }

    /**
     * Beim Laden wird die Attributliste aus save.dat
     * herausgeholt und dann einer Aufgabe übergeben,
     * damit sie sich erstellen kann. Die Attributliste enthält alle wichtigen Daten, damit sich die Aufgabe identifizieren
     * kann und so in der GUI wiederfindbar ist. Danach wird das Objekt mit den jeweiligen Eigenschaften erstellt. 
     * Der Konstruktor erstellt zwar das Objekt, allerdings legt dieser nur die Eigenschaften der Aufgabe fest.
     * Die Erscheinung auf der Oberfläche geschieht erst im nächsten Schritt, wenn die Aufgaben gezeichnet wird.
     * 
     * @see Aufgabe
     * @see Aufgabe#zeichnen()
     * 
     * @param eigenschaften Liste der Eigenschaften der Aufgabe, die bei Programmstart aus der {@link GUI#speicherliste} geladen wird.
     */

    //Konstruktor, nur mit Eigenschaften, dass die vernünftig gesetzt sind
    public Aufgabe(List<String> eigenschaften) {
        this.text = eigenschaften.get(0);
        this.status = Boolean.parseBoolean(eigenschaften.get(1));
        this.typ = eigenschaften.get(2);
        this.kategorie = eigenschaften.get(3);

        GUI.aufgabenliste.add(this);
    }

    /**
     * Wird eine Aufgabe gezeichnet, so wird in der GUI {@link GUI#aufgabeZeichnen(Aufgabe)} aufgerufen.
     */

    //Aufgabe wird erstellt abhängig vom Typ, der schon als Attribut gespeichert ist
    public void zeichnen() {
        GUI.aufgabeZeichnen(this);       
    }

    /**
     * Ähnlich wie in {@link #zeichnen()}, mit dem Unterschied, dass der mitgegebene Typ in den Attributen gespeichert wird.
     * 
     * @param typ Setzt den Typ der Aufgabe.
     */

    //nur für Neuerstellen; Typ wird einfach gesetzt und dann erstellt
    public void zeichnen(String typ) {
        this.typ = typ;
        GUI.aufgabeZeichnen(this);
    }

    /**
     * Das Verstecken der Aufgabe ist notwendig, damit gelöschte Aufgaben nicht mehr
     * angezeigt werden.
     * Davor werden sie noch mal gespeichert. <br>
     * Dazu wird in der GUI {@link GUI#aufgabeVerstecken(Aufgabe)} aufgerufen.
     */

    public void verstecken(){
        GUI.aufgabeVerstecken(this);
    }

    /**
     * Zuerst wird die Attributliste gelöscht und neugeschrieben, damit die
     * Eigenschaften aktuell sind
     * und keine alten Daten noch vorhanden sind.
     * Danach wird die Attributliste der Speicherliste hinzugefügt.
     */

    public void speichern() {

        this.attribute.clear();

        if (this.typ.equals("Aufgabe")) {
            if (this.textfeld != null) {
               this.text = this.textfeld.getText();
            }
            else {
                this.text = "";
            }
            this.status = this.checkbox.isSelected();
        }
        else {
            this.text = this.textarea.textArea.getText();
        }

        this.attribute.add(this.text);
        this.attribute.add(Boolean.toString(this.status));
        this.attribute.add(this.typ);
        this.attribute.add(this.kategorie);

        GUI.speicherliste.add(this.attribute);
    }

    /**
     * Das Löschen einer Aufgabe ist einfacher, als man zunächst vermutet.
     * Zuerst wird die Aufgabe versteckt, was bedeutet, dass alle GUI-Elemente der Aufgabe
     * gelöscht werden. Danach wird die Aufgabe aus der Aufgabenliste entfernt, was bedeutet, dass
     * es innerhalb des Programms keine Referenzen mehr zu diesem Aufgabenelement gibt und es auch nicht mehr
     * abrufbar ist. Durch die Entfernung aus der Aufgabenliste verschwindet es auch aus der Speicherliste. <br>
     * Mit dem Aufruf, dass alle Aufgaben neu gezeichnet werden sollen, wird die Oberfläche aktualisiert und
     * die Aufgabe verschwindet vom Bildschirm. <br>
     * Es ist wichtig, dass die Aufgabe vorher versteckt wird, da nach dem Löschen aus der Aufgabenliste nicht mehr 
     * auf die Aufgabe zugegriffen werden kann, was bedeutet, dass sie vom Neuzeichnen auch nicht versteckt wird.
     * Mit anderen Worten, die Aufgabe würde sonst auf dem Bildschirm verbleiben und ist nicht mehr löschbar.
     */

    public void loeschen() {
        //Aufgabe ist noch sichtbar, wenn aus der Liste entfernt wurde
        //--> GUI.aufgabenneuzeichnen hat nicht gewirkt
        this.verstecken();

        //entfernt seine Aufgabe aus der Liste
        GUI.aufgabenliste.remove(this);

        //alle anderen Aufgaben bekommen Befehl, sich neu zu sortieren
        GUI.aufgabenNeuZeichnen();
    }
}
