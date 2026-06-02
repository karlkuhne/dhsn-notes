package todo;

import javax.swing.*;

/**
 * Die Klasse Tab beschreibt das Fenster, in dem alle Aufgaben angezeigt werden.
 * Es besteht aus einem JScrollPane, in dem die Oberfläche, ein
 * JPanel, hinzugefügt wird. Die {@link Aufgabe}n selber
 * befindet sich in der Oberfläche. Bei der Initialisierung wird der Tab noch
 * der Tabliste der GUI hinzugefügt, um
 * den Tab wiederfinden zu können. Sonst kann das Objekt nichts - was auch
 * gewollt ist, damit die Verwaltung des Programms
 * zentral in der {@link GUI} stattfindet.
 * <p>
 * yKoordinate <br>
 * Die yKoordinate gibt die yKoordinate wieder, welche die letzte Todo hat.
 * Beim Einfügen einer neuen Todo wird die yKoordinate mit 40 addiert, wo dann
 * die nächste Aufgabe platziert wird.
 * So weiß jedes Objekt im Programm genau, wo sich die letzte Aufgabe befindet.
 * Beim Neuzeichnen ist es entsprechend wichtig, dass diese Koordinate wieder
 * zurück auf den Startwert gesetzt wird.
 * <p>
 * Tab/Kategorie/Label?
 * Tab heißt es genau dann, wenn von der Oberfläche gesprochen wird.
 * Kategorie, wenn von der Nutzeranwendung die Rede ist und die Mechanik gemeint ist.
 * 
 * @see GUI
 */

public class Tab{

    public JPanel oberflaeche;
    public JScrollPane scrollPane;
    public String kategorie;

    //legt fest, wo sich das oberste Element gerade befindet
    public int yKoordinateStart = 10; //Konstante, die den Startwert angibt
    public int yKoordinate = yKoordinateStart; //Welche Höhe im Frame

    /**
     * Erstellt die Oberfläche (JPanel), in dem die Aufgaben angezeigt werden, erstellt das JScrollPane, 
     * was das Fenster verwaltet bzw. vom TabbedPane (der Tabmechanik) verwaltet wird. <br>
     * Fügt sich noch der Tabliste hinzu, damit das Menü diesen Tab noch wiederfindet.
     * 
     * @param kategorie Name des Tabs; in dieser Kategorie werden die zugehörigen Aufgaben gespeichert.
     */

    public Tab(String kategorie) {
        this.kategorie = kategorie;

        //Feld wird hinzugefügt, worin Aufgaben dann stehen können
        oberflaeche = new JPanel();
        oberflaeche.setLayout(null);
        
        scrollPane = new JScrollPane(oberflaeche);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        //Scrollgeschwindigkeit festlegen (höhere Zahl = schneller scrollen)
        scrollPane.getVerticalScrollBar().setUnitIncrement(20);

        /*
        sagt dem EventHandler, dass dies so bald wie möglich ausgeführt werden soll (sobald er Zeit hat)
        dadurch, dass Tab in einer for-Schleife erstellt wird, kommt es an diesem Punkt oft zu einem Fehler,
        da danach Infos von der GUI gefordert wurden, sie aber noch nicht aktualisiert wurde (ungültiger Zustand).
        Das Programm funktioniert aber trotzdem noch, da es nur die Sichtbarkeit des Tabs beeinflusst, er
        existiert aber schon und wird erst kurz darauf angezeigt, sobald der Thread Zeit hat. Dies ist wichtig
        für die Aufgabe, da sie danach Informationen vom Tab braucht.
        */
        SwingUtilities.invokeLater(() -> {
            GUI.tabbedPane.addTab(this.kategorie, scrollPane);
            GUI.tabliste.add(this);
        });
    }
}