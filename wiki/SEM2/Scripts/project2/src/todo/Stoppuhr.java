package todo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.Timer;
import java.awt.event.ActionListener;

/**
 * Die Stoppuhr bekommt die Eigenschaften und Methoden der Java-Swing-Klasse
 * "Timer" geerbt.
 * Sie ist dazu da, in regelmäßigen Abständen die To-dos automatisch zu speichern und die jeweiligen
 * Listen zu sortieren.
 * 
 */

public class Stoppuhr extends Timer {

    /**
     * Die Stoppuhr bekommt die Eigenschaften und Methoden der Java-Swing-Klasse "Timer" geerbt.
     * Daher ist der Konstruktor notwendig, um die richtigen Attribute übernehmen zu können, genauso wie es der Timer macht.
     * An dieser Stelle haben wir von einem einheitlichen Codestil abgesehen, um die Variablen so benannt lassen, wie es die
     * Klasse "Timer" vorsieht. Damit wollen wir Verwirrung vermeiden und den gewohnten Umgang mit den Variablen ermöglichen.
     * 
     * @see "javax.swing.Timer"
     * 
     * @param delay Aller n Sekunden wird die Funktion aufgerufen.
     * @param listener Funktion, die aufgerufen werden soll.
     */

    //neuer Konstruktor notwendig, damit Daten richtig weitergegeben wird
    public Stoppuhr(int delay, ActionListener listener) {
        super(delay, listener);
    }

    /**
     * Initialisiert den Timer, der alle 1000 ms jede Aufgabe (mittels for-Schleife)
     * speichert ({@link Aufgabe#speichern}) und die Aufgaben sortiert ({@link GUI#sortierenAufgabenlisteOffen}).
     * Im Anschluss wird noch die Speicherliste lokal in der save.dat gesichert.
     * 
     * @see GUI#speicherliste
     * @see Aufgabe#speichern
     */

    public void ausfuehren() {
        
        // Daten aus Aufgaben holen
        GUI.speicherliste.clear();
        
        for (Aufgabe aufgabe : GUI.aufgabenliste) {
            aufgabe.speichern();
        }

        // Sicher speichern der Speicherliste als save.dat
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("save.dat"))) {
            oos.writeObject(GUI.speicherliste);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
