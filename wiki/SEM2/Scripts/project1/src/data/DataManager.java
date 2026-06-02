package data;

import model.ToDoList;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Diese Klasse kümmert sich um das Speichern und Laden der ToDo-Listen.
 */
public class DataManager {

    private static final String SAVE_FILE = "todolists.ser";

    /**
     * Speichert eine Liste von ToDoList-Objekten in eine Datei.
     * @param lists Die Liste der zu speichernden ToDoList-Objekte.
     */
    public void saveLists(List<ToDoList> lists) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SAVE_FILE))) {
            oos.writeObject(lists);
            System.out.println("Daten erfolgreich gespeichert in " + SAVE_FILE);
        } catch (IOException e) {
            System.err.println("Fehler beim Speichern der Daten: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Lädt eine Liste von ToDoList-Objekten aus einer Datei.
     * @return Eine Liste mit den geladenen ToDoList-Objekten oder eine leere Liste, wenn keine Datei gefunden wurde.
     */
    @SuppressWarnings("unchecked")
    public List<ToDoList> loadLists() {
        File file = new File(SAVE_FILE);
        if (!file.exists()) {
            System.out.println("Keine Speicherdatei gefunden. Starte mit einer leeren Liste.");
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SAVE_FILE))) {
            List<ToDoList> lists = (List<ToDoList>) ois.readObject();
            System.out.println("Daten erfolgreich aus " + SAVE_FILE + " geladen.");
            return lists;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Fehler beim Laden der Daten: " + e.getMessage());
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
