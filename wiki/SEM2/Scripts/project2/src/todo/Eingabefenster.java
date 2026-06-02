package todo;

import javax.swing.*;

/**
 * Das Eingabefenster hat die Aufgabe, elegant Daten entgegenzunehmen und zu verarbeiten.
 * Es fragt den User nach einer speziellen Eingabe, welche es dann abhängig von dessen Funktion dann
 * weiterschickt oder direkt verwertet.
 */

public class Eingabefenster {

    private JFrame eingabeFrame;
    private String text = "";
    public String uebergabe = "";

    /**
     * Im Konstruktor wird ein String text übergeben, welcher der Anzeigetext ist, die für den Nutzer
     * dann sichtbar wird, die Überschrift quasi.
     * Die {@link #aktionAusfuehren(String)} steht dafür, falls mit den eingegebenen Daten etwas getan werden soll, dass sie dann
     * entsprechend noch vom Eingabefenster verarbeitet werden kann. Manchmal stellte es sich nämlich als
     * kompliziert heraus, die Daten über ActionListener weiterzugeben, weshalb sich dafür entschieden
     * wurde, die Aktion hier gleich heranzuhängen. Voraussetzung dafür ist natürlich, dass die Aktion übersichtlich
     * bleibt, wie zum Beispiel die Aufgabe, einen neuen Tab schlicht zu erstellen.
     * 
     * @see #aktionAusfuehren(String)
     * 
     * @param text Text, den das Eingabefenster anzeigt.
     * @param aktion Aktion, die vom Eingabefenster bei Knopfdruck ausgeführt werden soll.
     * @param maximaleZeichen Maximale Anzahl von Zeichen, die in das Eingabefenster eingegeben werden können. Wird von der GUI vorgegeben.
     */
    
    public Eingabefenster(String text, String aktion, int maximaleZeichen) {

        this.text = text;

        //Eingabefenster erstellt
        eingabeFrame = new JFrame("Eingabe erforderlich");
        eingabeFrame.setSize(500, 300);
        eingabeFrame.setLayout(null);

        //Überschrift
        JLabel ueberschrift = new JLabel(this.text);
        eingabeFrame.add(ueberschrift);
        ueberschrift.setBounds(100, 70, 200, 30);
        
        //Eingabefeld
        JTextField eingabefeld = new JTextField();
        eingabefeld.setBounds(100, 100, 200, 30);
        eingabeFrame.add(eingabefeld);

        //Button zum Übernehmen und Schließen
        JButton bestaetigen = new JButton("Bestätigen");
        bestaetigen.setBounds(350, 100, 100, 30);
        eingabeFrame.add(bestaetigen);

        //Fenster wird geschlossen, eingabe übermittelt
        bestaetigen.addActionListener((h) -> {
            //Begrenzung der Zeichen
            if (eingabefeld.getText().length() <= maximaleZeichen) {
                //gibt die Eingabe weiter
                this.uebergabe = eingabefeld.getText();

                aktionAusfuehren(aktion);

                //schließt das Fenster
                eingabeFrame.dispose();
            }
            else {
                //extra Fenster mit dem vorgegebenen Text, mit OK Button
                JOptionPane.showMessageDialog(null, "Zu viele Zeichen eingegeben!", "Fehler", JOptionPane.ERROR_MESSAGE);
            }
        });

        eingabeFrame.setVisible(true);
    }

    /**
     * Aus Übersichtsgründen wurde diese Funktion ausgelagert. Sie wird vom Actionlistener ausgeführt, 
     * wenn der Button des Eingabefensters angeklickt wird. <br>
     * Grundsätzlich ist es so gebaut, dass es erweiterbar ist. Das Eingabefenster wird aber bisher
     * nur an einer Stelle verwendet (Erstellen von Kategorien). Das Eingabefenster bekommt über einen String
     * mitgeteilt, welche Aktion er bei Klicken des Buttons ausführen soll. Mit der If-Verzweigung kann dann
     * jede Aktion so ausgeführt werden. <br>
     * 
     * <p>
     * 
     * Die Aktion "filter" erstellt einen neuen Tag, eine neue Kategorie. Da wird zunächst geprüft,
     * ob der Tab schon existiert. Dafür wird durch die Tablsite iteriert. Existiert der Tab schon, wird 
     * die Variable "existiertNicht" auf false gesetzt. Damit wird verhindert, dass der Tab erstellt wird und
     * eine Fehlermeldung wird ausgegeben. 
     * <br>
     * Hinweis: Der Name "filter" ist eigentlich veraltet und stammt aus früheren Versionen des Programms, als
     * es noch keine Tabs, sondern nur den Filter gab.
     * 
     * @param aktion Aktion, die vom Eingabefenster bei Knopfdruck ausgeführt werden soll.
     */

    //führt bei Knopfdruck diese Aktion aus
    public void aktionAusfuehren(String aktion) {

        //gibt es diesen Tab schon in der Tabliste?
        boolean existiertNicht = true;

        //erstellt einen neuen Tab
        if (aktion.equals("kategorie")) {
            for (Tab tab : GUI.tabliste) {
                if (tab.kategorie.equals(uebergabe)) {
                    //extra Fenster mit dem vorgegebenen Text, mit OK Button
                    JOptionPane.showMessageDialog(null, "Kategorie existiert bereits", "Fehler", JOptionPane.ERROR_MESSAGE);

                    //wenn der Tab schon existiert, wird Variable false, sodass verhindert, dass Tab erstellt
                    existiertNicht = false;
                }

            }
            //wenn es schon gibt, dann false
            if (existiertNicht) {
                @SuppressWarnings("unused") //für den Fall einer Programmerweiterung kann die Variable evtl. noch genutzt werden
                Tab filter = new Tab(uebergabe);
            }
        }
    }
}