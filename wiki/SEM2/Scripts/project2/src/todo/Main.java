package todo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * Programmstart
 */

public class Main {

    /**
     * Programmstart <br>
     * Es wird die {@link GUI} gebaut und damit das Programm/Mainloop gestartet.
     * Außerdem wird der Timer/die {@link Stoppuhr} erstellt, die dafür sorgt, dass das
     * Programm jede Sekunde speichert, bevor aus der "save.dat", der lokalen Speicherdatei,
     * alle gespeicherten Aufgaben geladen und der {@link GUI#aufgabenliste} übergeben werden, mit der die GUI dann arbeitet. <br>
     * Als letztes wird die {@link GUI} gestartet, die dann alle Bildelemente erstellt und sie dann verwalten kann.
     * 
     * @see GUI
     * @see GUI#aufgabenliste
     * @see Stoppuhr
     */

    @SuppressWarnings("unchecked") //unterdrückt die Warnungen für die Typenkompatibilität beim Laden der save.dat

    public static void main(String[] args) {

        //automatisches Speichern jede Sekunde und sortieren der Aufgaben
        Stoppuhr timerAutomatischSpeichern = new Stoppuhr(1000, null);
        timerAutomatischSpeichern.addActionListener(h -> {
            GUI.sortierenAufgabenlisteOffen();
            timerAutomatischSpeichern.ausfuehren();
        });
        timerAutomatischSpeichern.start();

        //Laden der unter save.dat gespeicherten Aufgaben
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("save.dat"));
            GUI.speicherliste = (List<List<String>>) ois.readObject();
            ois.close();
        }
        catch (IOException | ClassNotFoundException e) {
            //e.printStackTrace();
            //save.dat existiert noch nicht - wird also beim ersten Speichern erstellt
        }

        GUI GUI = new GUI();
        GUI.ausfuehren();
    }
}