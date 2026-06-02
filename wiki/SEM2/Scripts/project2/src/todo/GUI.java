package todo;

import javax.swing.*;               //Swing, GUI
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.awt.*;

/**
 * Die GUI definiert die grafische Oberfläche des Programms und stellt die wesentlichen
 * Funktionen direkt nach dem Start bereit.
 */

//für Ausgabe
public class GUI {

    //Deklarationen
    public static JFrame mainFrame; // Name so beibehalten, um nicht zu verwirren und zu wissen, was für ein Typ das ist
    public static JTabbedPane tabbedPane; //Name so beibehalten, um nicht zu verwirren und zu wissen, was für ein Typ das ist

    /**
     * Die Aufgabenliste ist ein wesentlicher Bestandteil des Programms. Darin werden alle Aufgabenobjekte gespeichert,
     * die sich gerade im Bild befinden. Dies dient dazu, leicht auf alle Aufgaben zugreifen zu können, ohne jede Aufgabe
     * einzeln aufrufen zu müssen, da es so einfach möglich ist, über eine for-Schleife durch jedes Element zu iterieren.
     * Die Aufgaben sind jeweils als Aufgabenobjekt drin gespeichert, mitsamt ihren Attributen und Methoden.
     * 
     * @see Aufgabe
     */

    public static List<Aufgabe> aufgabenliste = new ArrayList<>();

    /**
     * Die Speicherliste ist ein Kernelement des Programms und stellt sicher, dass die Daten persistent sind, also
     * auch nach dem Schließen des Programms verfügar bleiben.
     * Aufgabe ist es, jede Todo zu speichern. Die ursprüngliche Idee war es, die Todo als Objekt als solches direkt zu speichern.
     * Dies hätte die Wartung vereinfacht, hätte die Todo weitere Attribute bekommen, da so einfacher darauf zugreifbar wäre.
     * Da dies sich aber als sehr schwierig herausstellte, wurde beschlossen, nur die Attribute zu speichern, denn diese machen
     * jede Aufgabe erst einzigartig, während die Methoden für jeden gleich sind.
     * <p>
     * Die Attribute werden der Reihenfolge nach in eine Liste gespeichert.
     * Der Datentyp ist String, was bedeutet, dass es möglich ist, dass andere Datentypen konvertiert werden müssen.
     * Diese Liste wird in die Speicherliste geschrieben. Der Aufruf dieser Liste erfolgt so, dass die Reihenfolge der Attributwerte
     * genau der entsprechen, wie die der Aufgaben, wie sie angezeigt werden. So kommt auch der komplizierte Datentyp
     * "List&lt;List&lt;String&gt;&gt;" zustande. <br>
     * Umso wichtiger ist es, vor dem Speichern in die save.dat diese Liste zu leeren und alle Objekte vom Typ Aufgabe
     * anzuweisen, neu zu speichern. Sonst verbleiben gelöschte Todos noch in der Speicherliste, was nicht erwünscht ist.
     * <p>
     * Die Speicherliste selbst kann wie ein Päckchen angesehen werden, was viele weitere Päckchen enthält, mit denen dann die konkrete
     * Aufgabe identifiziert und rekonstruiert werden kann. 
     * Das große Paket dient der leichten Handhabung für das Speichern. So ist kein Parsen notwendig und es braucht nur eine Liste
     * geladen und gespeichert werden, die das Programm je nach Bedarf auspacken kann.
     * 
     * @see Aufgabe
     * @see Aufgabe#speichern
     */

    public static List<List<String>> speicherliste = new ArrayList<>(); //Liste, die die attribute-Listen der Aufgaben enthält
    
    /**
     * Die Tabliste ist eine wichtige Komponente der GUI. Hier werden alle Tabs gespeichert, die gerade im Programm verwendet werden.
     * Das ist besonders wichtig, wenn die Aufgaben angezeigt werden, denn sie müssen wissen, in welchen Tab sie angezeigt werden
     * müssen. Dafür muss es möglich, den richtigen Tab überhaupt heraussuchen zu können.
     * 
     * @see #aufgabeZeichnen(Aufgabe)
     */

    public static List<Tab> tabliste = new ArrayList<>();

    /**
     * Die Kategorieliste ist ein wichtiges Hilfswerkzeug bei der Initialisierung des Programms. <br>
     * Da nur die Eigenschaften der Aufgaben gespeichert werden, kommt es zu einem Zirkelbezug, wenn man versucht,
     * daraus den {@link Tab} zu erstellen. Da aber das Label der Aufgabe gespeichert wird, wird sie in der Kategorieliste zwischengespeichert.
     * Nachdem alle Labels aus allen Aufgaben nach dem Laden ausgelesen wurde, werden alle Dopplungen entfernt (mittels übersetzen
     * in ein Set und Zurückportierung in die Liste), woraus dann die Tabs erstellt werden können, da sie nur den Namen
     * brauchen, um die Aufgaben verwalten zu können.
     */

    public static List<String> kategorieliste = new ArrayList<>();

    //Globale Var
    public static int maximaleZeichenFuerTab = 25;

    /**
     * Bei Programmstart wird die GUI gestartet. Dabei geht sie wichtige Aufgaben durch. <br>
     * Sie ... <br>
     * - erstellt das Programm Frame (JFrame).
     * - erstellt die Menubar (JMenuBar) und dazugehörige Actionlistener.
     * - erstellt die Tableiste (JTabbedPane) und sorgt dafür, dass sie korrekt initialisiert wird.
     * - erstellt die Aufgabenliste aus der von der Main geladenen Speicherliste und
     * - erstellt entsprechend alle in der Speicherdatei gespeicherten Aufgaben, ohne sie zu zeichnen.
     * - erstellt die Kategorieliste ({@link #kategorieliste}) und daraus die Tabs ({@link Tab}). 
     * - ordnet allen Aufgaben den richtigen zugehörigen {@link Tab} zu.
     * - lädt die Anzeige neu, um die Aufgaben auch anzuzeigen.
     * 
     * @see GUI#aufgabenliste
     */

    //Programm wird gestartet
    public void ausfuehren() {

        //Fenster erstellen
        mainFrame = new JFrame("TODO-Liste");
        mainFrame.setSize(800, 600);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);

        //
        //Menubar
        //

        // Menüleiste erstellen
        JMenuBar menuBar = new JMenuBar();

        // Menü "Datei"
        JMenu dateiMenu = new JMenu("Datei");
        JMenuItem beendenItem = new JMenuItem("Beenden");
        JMenuItem hilfe = new JMenuItem("Hilfe");

        // Menüeinträge zeichnen
        dateiMenu.add(hilfe);
        dateiMenu.add(beendenItem);

        // Aktionen hinzufügen
        beendenItem.addActionListener(e -> System.exit(0));
        hilfe.addActionListener(e -> {
            // Pfad zur lokalen HTML-Datei
            File htmlFile = new File("javadoc/allclasses-index.html");

            try {
                // Datei im Standard-Webbrowser öffnen
                if (htmlFile.exists()) {
                    Desktop.getDesktop().browse(htmlFile.toURI());
                } else {
                    JOptionPane.showMessageDialog(null, "Javadoc wurde nicht gefunden!", "Fehler", JOptionPane.ERROR_MESSAGE);      //extra Fenster mit dem vorgegebenen Text, mit OK Button
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        // Menü "neues Item"
        JMenu neueListeMenu = new JMenu("Neues Item");
        JMenuItem neueAufgabe = new JMenuItem("Neue Aufgabe");
        JMenuItem neueNotiz = new JMenuItem("Neue Notiz");

        neueListeMenu.add(neueAufgabe);
        neueListeMenu.add(neueNotiz);

        JMenu tabManager = new JMenu("Kategorien managen");
        //JMenuItem aufgabenNachStatusSortieren = new JMenuItem("Aufgaben nach Status sortieren");
        JMenuItem neueKategorie = new JMenuItem("Neue Kategorie");
        JMenuItem tabLoeschen = new JMenuItem("Aktuellen Tab löschen");

        tabManager.add(neueKategorie);
        tabManager.addSeparator();  // Trennlinie
        //tabManager.add(aufgabenNachStatusSortieren);
        tabManager.add(tabLoeschen);

        //Aufgabe wird von Button erstellt
        neueAufgabe.addActionListener((h) -> {
            //Wenn die tabliste leer ist, dann gebe eine Errormessage aus, ansonsten erstelle die Aufgabe
            if(!tabliste.isEmpty()) {
                Aufgabe aufgabe = new Aufgabe();
                aufgabe.zeichnen("Aufgabe");
            }
            else {
                JOptionPane.showMessageDialog(null, "Sie müssen zuerst eine Kategorie erstellen!", "Fehler", JOptionPane.ERROR_MESSAGE);      //extra Fenster mit dem vorgegebenen Text, mit OK Button
            }
        });
        //Notiz wird von Button erstellt
        neueNotiz.addActionListener((h) -> {
            //Wenn die tabliste leer ist, dann gebe eine Errormessage aus, ansonsten erstelle die Notiz
            if(!tabliste.isEmpty()) {
                Aufgabe aufgabe = new Aufgabe();
                aufgabe.zeichnen("Notiz");
            }
            else {
                JOptionPane.showMessageDialog(null, "Sie müssen zuerst eine Kategorie erstellen!", "Fehler", JOptionPane.ERROR_MESSAGE);      //extra Fenster mit dem vorgegebenen Text, mit OK Button
            }
        });
        //Aufgaben werden nach Status sortiert
        /*aufgabenNachStatusSortieren.addActionListener((h) -> {
            sortierenAufgabenlisteOffen();
            aufgabenNeuZeichnen();
        });*/
        //neue Kategorie/ein neuer Tab wird hinzugefügt
        neueKategorie.addActionListener((h) -> {
            @SuppressWarnings("unused") //für den Fall einer Programmerweiterung kann die Variable evtl. noch genutzt werden
            Eingabefenster eingabe = new Eingabefenster("Kategoriename (max. " + maximaleZeichenFuerTab + " Zeichen):", "kategorie", maximaleZeichenFuerTab);
        });
        tabLoeschen.addActionListener((h) -> {
            //Wenn die tabliste leer ist, dann gebe eine Errormessage aus, ansonsten lösche den Tab
            if(!tabliste.isEmpty()) {
                //Liste zum Zwischenspeichern der Elemente, die aus der aufgabenliste entfernt werden sollen
                List<Aufgabe> zuEntfernendeAufgaben = new ArrayList<>();

                for (Aufgabe aufgabenelement : aufgabenliste) {

                    if (aufgabenelement.kategorie.equals(tabbedPane.getTitleAt(tabbedPane.getSelectedIndex()))) {
                        aufgabenelement.verstecken(); // nicht löschen
                        zuEntfernendeAufgaben.add(aufgabenelement);
                    }
                }

                // jetzt außerhalb der Schleife entfernen
                GUI.aufgabenliste.removeAll(zuEntfernendeAufgaben);

                for (Tab tab : GUI.tabliste) {
                    if (tabbedPane.getTitleAt(tabbedPane.getSelectedIndex()).equals(tab.kategorie)) {
                        tabliste.remove(tab);
                        break;
                    }
                }

                tabbedPane.removeTabAt(tabbedPane.getSelectedIndex());
            }
            else {
                JOptionPane.showMessageDialog(null, "Sie müssen zuerst eine Kategorie erstellen!", "Fehler", JOptionPane.ERROR_MESSAGE);      //extra Fenster mit dem vorgegebenen Text, mit OK Button
            }
        });

        // Menubar zur Menüleiste hinzufügen
        menuBar.add(dateiMenu);
        menuBar.add(neueListeMenu);
        menuBar.add(tabManager);

        // Menüleiste zum Frame hinzufügen
        mainFrame.setJMenuBar(menuBar);

        //
        //Ende Menubar
        //

        //Tab Leiste erstellen
        tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
        @SuppressWarnings("unused") //für den Fall einer Programmerweiterung kann die Variable evtl. noch genutzt werden
        JPanel tab = new JPanel();
        // TabbedPane zum Frame hinzufügen
        mainFrame.add(tabbedPane);

        //gehe die Liste lang und übergebene enthaltene Liste der Aufgabe, damit sie sich erstellen kann
        for (List<String> aufgabenliste : speicherliste) {
            Aufgabe aufgabe = new Aufgabe(aufgabenliste);
            //aufgabe.zeichnen();
            kategorieliste.add(aufgabe.kategorie);  //Herausnehmen aller Labels
        }

        //doppelte Labels werden gelöscht, da zu Set konvertiert und dann wieder als Liste dargestellt
        Set<String> set = new LinkedHashSet<>(kategorieliste);
        kategorieliste.clear();
        kategorieliste.addAll(set);

        //erstellt alle Tabs nach Kategorieliste
        for (String label : kategorieliste) {
            Tab kategorie = new Tab(label);

            //prüfe jede Aufgabe, ob sie zu Dir gehört
            for (Aufgabe aufgabenelement : aufgabenliste) {
                if (aufgabenelement.kategorie.equals(kategorie.kategorie)) {
                    aufgabenelement.zugehoerigerTab = kategorie;
                }
            }
        }

        //Bauen der Umgebung fertig, jetzt können alle Aufgaben rein
        aufgabenLaden();

        //neu gezeichnet
        mainFrame.revalidate();
        mainFrame.repaint();
    }

    /**
     * Diese Funktion ist notwendig, um einen Crash bei Programmstart zu verhindern, da sonst zum
     * Anzeigen der Aufgaben {@link #aufgabenNeuZeichnen} verwendet wird. Dies funktioniert nicht, da
     * {@link #aufgabenNeuZeichnen} zusätzlich noch {@link #aufgabeVerstecken(Aufgabe)} verwendet, was nicht funktioniert,
     * wenn noch keine Aufgaben angezeigt wurden. Außerdem wurde die for-Schleife eingespart, die die yKoordinaten
     * aller Tabs ({@link Tab}) zurücksetzt, was zum Start ja nicht benötigt wird. <br>
     * Die Funktion iteriert also nur durch die {@link #aufgabenliste} und ordnet jeder Aufgabe an, sich zu zeichnen.
     * 
     * @see GUI#aufgabenNeuZeichnen
     * @see GUI#aufgabeZeichnen
     */
    
    //gleiche wie aufgabenNeuZeichnen, nur ohne verstecken und ohne Zur
    public static void aufgabenLaden() {

        //Alle gespeicherten Aufgaben werden erstellt
        //foreach-Schleife in der Liste der Aufgaben, alle werden gezeichnet
        for (Aufgabe aufgabenelement : aufgabenliste) {
            aufgabenelement.zeichnen();
        }

    }

    /**
     * Sorgt dafür, dass die {@link Aufgabe}n neu gezeichnet werden. Dies ist notwendig,
     * damit gelöschte Aufgaben auch wirklich vom
     * Bildschirm verschwinden, da sie sonst noch angezeigt werden, obwohl sie nicht
     * mehr existieren.
     * Dafür werden alle Elemente erstmal vom Bildschirm genommen und anschließend
     * neu gezeichnet.
     * Wichtig ist dabei, dass die yKoordinate wieder zurückgesetzt wird, da
     * die Aufgaben sonst außerhalb des Bildschirms gehen. Dafür wird durch die {@link #tabliste}
     * iteriert und von allen Tabs die yKoordinate zurückgesetzt.
     * Die Neuzeichnung funktioniert über die {@link #aufgabenliste}.
     * 
     * @see GUI#aufgabeZeichnen
     * @see GUI#tabliste
     * @see GUI#aufgabenliste
     */

    //zeichnet alle aufgaben neu
    public static void aufgabenNeuZeichnen() {

        //aktueller Tab
        //aktuellPanel.yKoordinate = aktuellPanel.yKoordinateStart;

        for (Tab tab : tabliste) {
            tab.yKoordinate = tab.yKoordinateStart;
        }


        //alle vorhandenen verstecken
        for (Aufgabe aufgabenelement : aufgabenliste) {
            aufgabenelement.verstecken();
        }

        //Alle gespeicherten Aufgaben werden erstellt
        //foreach-Schleife in der Liste der Aufgaben, alle werden erstellt, y-koordinate muss zurückgesetzt werden
        for (Aufgabe aufgabenelement : aufgabenliste) {
            aufgabenelement.zeichnen();
        }
    }

    /**
     * Das Erstellen einer {@link Aufgabe} könnte weitaus spannender sein. Allerdings ist
     * die gesamte Vorarbeit bereits in
     * den Konstruktoren getan und die Eigenschaften sind
     * bereits gesetzt.
     * Diese Eigenschaften werden nun in der Funktion nur noch den untergeordneten Objekten
     * mitgegeben, damit deren Erscheinung auch richtig ist.
     * Wichtig ist auch, dass die yKoordinate richtig weitergezählt wird.
     * <p>
     * Die untergeordneten Objekte werden von der {@link Aufgabe} verwaltet. Alle Objekte
     * sind aber so aneinander verknüpft, dass sie
     * jeweils ihre Beziehung wissen. So ist es ohne viel Aufwand möglich, die
     * Methoden jeweils voneinander aufzurufen oder
     * bei Aktionen deren Erscheinungen zu ändern, etwa bei Erledigen oder Löschen
     * der Aufgabe.
     * <p>
     * Es können alle Aufgaben gleichzeitig gezeichnet werden, auch wenn nicht alle sichtbar sind.
     * Das hängt mit der Funktion der Tabs zusammen. Die tabbedPane zeigt nur das ausgewählte Fenster an. 
     * Die anderen Panels sind nicht sichtbar, damit auch die anderen Aufgaben - und alle Aufgaben können
     * gleichzeitig gezeichnet werden, ohne dass man die Labels unterscheiden muss.
     * <p>
     * Ursprünglich war diese Funktion als Methode der jeweilige {@link Aufgabe} geplant.
     * Mit dem Umbau der {@link GUI} wurde sich aber dafür entschieden, alle Anzeigeelemente
     * nur von der {@link GUI} erstellen zu lassen. Daher zeigen die Methoden der Aufgaben 
     * nun auf die {@link GUI}. Das soll die Verwaltung vereinfachen und die Übersicht verbessern, 
     * wo welches Objekt angezeigt wird.
     * 
     * @see Aufgabe
     */

    public static void aufgabeZeichnen(Aufgabe aufgabe) {

        //setzt nächstes Feld weiter unten an
        for (Tab tab : tabliste) {
            if (tab.kategorie.equals(aufgabe.kategorie)) {
                aufgabe.zugehoerigerTab = tab;
            }
            
        }

        aufgabe.zugehoerigerTab.yKoordinate += 30;

        //Setzt die Größe der oberfläche auf die Breite des Frames und die Höhe der YKoordinate
        aufgabe.zugehoerigerTab.oberflaeche.setPreferredSize(new Dimension(
                mainFrame.getWidth(), // oder feste Breite
                aufgabe.zugehoerigerTab.yKoordinate + 30         //+ 30, weil sonst die Aufgaben abgeschnitten werden
        ));
        
        //prüft, ob Notiz oder Aufgabe, erstellt jeweilige Objekte und stellt richtigen Beziehungen her;
        //wenn Notiz: keine Checkbox und anderes Textfeld
        if (aufgabe.typ.equals("Aufgabe")) {
            aufgabe.textfeld = new Textfeld(aufgabe.text, aufgabe.zugehoerigerTab);
            aufgabe.checkbox = new Checkbox(aufgabe.textfeld, aufgabe.status, aufgabe.zugehoerigerTab);
        }
        else {
            aufgabe.textarea = new Textarea(aufgabe.text, aufgabe.zugehoerigerTab);    //mehr Platz und scrollbar
            aufgabe.zugehoerigerTab.yKoordinate += 30; //Textarea braucht mehr Platz

            //Setzt die Größe der oberfläche auf die Breite des Frames und die Höhe der YKoordinate
            aufgabe.zugehoerigerTab.oberflaeche.setPreferredSize(new Dimension(
                    // oder feste Breite
                    mainFrame.getWidth(),
                    // Setzt die Größe der oberfläche auf die Breite des Frames und die Höhe der yKoordinate
                    aufgabe.zugehoerigerTab.yKoordinate + 30
            ));
        }

        aufgabe.buttonLoeschen = new ButtonLoeschen(aufgabe, aufgabe.zugehoerigerTab);

        //neu zeichnen
        aufgabe.zugehoerigerTab.oberflaeche.revalidate();
        aufgabe.zugehoerigerTab.oberflaeche.repaint();
    }

    /**
     * Das Verstecken der {@link Aufgabe} soll alle Aufgaben vom Fenster entfernen. Dadurch werden sie unsichtbar.
     * Diese Funktion ist wichtig, um Änderungen an der Oberfläche sichtbar machen zu können, da sie sich sonst
     * nicht aktualisieren. <br>
     * Es werden nicht die Aufgaben entfernt, sondern nur die GUI-Elemente von der Oberfläche entfernt. Es ist
     * jederzeit möglich, die Aufgabe neu zu zeichnen und das Gestaltungsbild dadurch anzupassen. <br>
     * Außerdem initialisiert das Verstecken ein Speichern der Aufgaben, sodass auch sichergestellt werden kann,
     * dass alle Änderungen nach dem letzten Speichern in die Neuzeichnung übernommen werden können und keine
     * Informationen verloren gehen.
     * 
     * @see Aufgabe#verstecken()
     * 
     * @param aufgabe Aufgabe, die versteckt werden soll.
     */

    public static void aufgabeVerstecken(Aufgabe aufgabe) {

        //Aufgabe wird zuerst gespeichert
        aufgabe.speichern();

        //prüft, ob Aufgabe oder Notiz --> richtige Referenzen
        //entfernt entsprechend alle Objekte der Aufgabe vom Tab
        if (aufgabe.typ.equals("Aufgabe")) {
            aufgabe.zugehoerigerTab.oberflaeche.remove(aufgabe.textfeld);
            aufgabe.zugehoerigerTab.oberflaeche.remove(aufgabe.checkbox);
            aufgabe.zugehoerigerTab.oberflaeche.revalidate(); // Layout neu berechnen
            aufgabe.zugehoerigerTab.oberflaeche.repaint(); // neu zeichnen
        }
        else{
            aufgabe.textarea.loeschen(aufgabe);
        }

        //jede Aufgabe hat diesen Knopf, daher nicht in if; muss aber trotzdem vom Tab entfernt werden
        aufgabe.zugehoerigerTab.oberflaeche.remove(aufgabe.buttonLoeschen);

        //neu berechnen
        aufgabe.zugehoerigerTab.oberflaeche.revalidate();  // Layout neu berechnen
        aufgabe.zugehoerigerTab.oberflaeche.repaint();     // neu zeichnen
    }

    /**
     * Die Funktion GUI.sortierenAufgabenlisteOffen hat die Aufgabe, alle {@link Aufgabe}n nach ihrem Status zu
     * sortieren. Alle schon erledigte Aufgaben (abgehakt) werden ans Ende der Liste sortiert, während
     * die Reihenfolge der anderen Aufgaben sich nicht ändert. <br>
     * Es ist theoretisch auch möglich, die Aufgaben zusätzlich nach Notizen zu sortieren. Die zusätzliche
     * Logik ist aktuell aber noch auskommentiert.
     * <p>
     * Zuerst wird der aktuelle {@link Tab} herausgesucht. Als nächstes wird jede {@link Aufgabe} angeschaut und verglichen.
     * Wenn die Aufgabe noch offen ist und zu dem zugehörigen Fenster gehört, wird sie in die Liste der offenen
     * Aufgaben sortiert. Ist sie schon erledigt oder gehört nicht zum aktuellen Tab, wird sie in die Liste der
     * abgehakten Aufgaben gesteckt. <br>
     * Hinweis: Auch Notizen zählen aktuell als offene Aufgaben! <br>
     * Im Anschluss werden beiden Listen zusammengefügt, indem sie in die zurückgesetzte {@link #aufgabenliste} gespeichert
     * werden, zuerst die offenen Aufgaben, dann die abgehakten Aufgaben. <br>
     * Zuletzt wird angewiesen, alle Aufgaben neu zu zeichnen ({@link #aufgabeZeichnen(Aufgabe)}), damit die Sortierung 
     * auch Anwendung finden kann und nicht nur in der Liste sortiert sind.
     * <p>
     * Kurz gesagt werden die offenen Aufgaben des aktuellen Tabs nach vorn der aufgabenliste sortiert.
     * 
     * @see GUI#aufgabenliste
     */

    //analog zu speicherliste sortieren
    public static void sortierenAufgabenlisteOffen() {

        List<Aufgabe> offeneAufgaben = new ArrayList<>();
        List<Aufgabe> abgehakteAufgaben = new ArrayList<>();
        //List<Aufgabe> notizen = new ArrayList<>();

        // Initialisieren der Variable
        Tab aktuellerTab = null;

        // Zugriff auf das aktuell sichtbare Tab-Objekt zum Prüfen, welche sortiert werden sollen
        Component ausgewaehlterTab = GUI.tabbedPane.getSelectedComponent(); // Gibt die sichtbare JScrollPane zurück

        // Geht durch die Tabliste durch und schaut, ob der Tab zu der gerade ausgewählten Ebene gehört
        for (Tab tab : GUI.tabliste) {
            if (tab.scrollPane == ausgewaehlterTab) {
                aktuellerTab = tab;
                break;
            }
        }

        //jede Liste, die im Speichercache drin ist, wird angeschaut und entsprechend einsortiert
        for (Aufgabe aufgabenelement : aufgabenliste) {

            //schaut in die Liste an Index 1, wo Status gespeichert ist, sortiert in jeweilige Liste ein; 
            //prüft, ob überhaupt sortiert werden soll und das Aufgabenelement im richtigen Fenster ist 
            //(alle anderen werden gleich welcher Status in abgehakteAufgaben sortiert, ohne die Reihenfolge zu ändern)
            if (!aufgabenelement.status && aufgabenelement.zugehoerigerTab == aktuellerTab) {
                offeneAufgaben.add(aufgabenelement);
            }
            //wenn abgehakt (oder nicht zugehöriger Tab)
            else {
                abgehakteAufgaben.add(aufgabenelement);
            }
        }

        //aufgabenliste wird ja gleich neu befüllt
        aufgabenliste.clear();

        //zuerst die Notizen und abgehakten Aufgaben eingefügt, dann die abgehakten
        for (Aufgabe aufgabenelement : offeneAufgaben) {
            aufgabenliste.add(aufgabenelement);
        }
        for (Aufgabe aufgabenelement : abgehakteAufgaben) {
            aufgabenliste.add(aufgabenelement);
        }

        //neu gezeichnet
        aufgabenNeuZeichnen();
    }
}