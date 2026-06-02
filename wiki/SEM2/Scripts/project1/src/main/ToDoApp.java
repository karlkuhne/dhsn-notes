package main;

import data.DataManager;
import model.CheckboxToDoList;
import model.ChecklistItem;
import model.TextToDoList;
import model.ToDoList;
import ui.ChecklistCellRenderer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Collections;
import java.util.List;

/**
 * Die Hauptklasse für die ToDo-Listen-Anwendung.
 * Sie erstellt die grafische Benutzeroberfläche (GUI), verwaltet Benutzerinteraktionen
 * und koordiniert die Datenlogik und -speicherung.
 */
public class ToDoApp {

    // --- GUI-Komponenten ---
    private JFrame frame; // Das Hauptfenster der Anwendung
    private JList<ToDoList> toDoListJList; // Die Liste auf der linken Seite, die alle ToDo-Listen anzeigt
    private DefaultListModel<ToDoList> listModel; // Das Datenmodell für die linke JList

    private JPanel centerPanel;   // Der zentrale Bereich, der verschiedene Ansichten anzeigen kann
    private CardLayout cardLayout; // Das Layout, das wie ein Kartenstapel zwischen Ansichten wechselt

    // "Karte" für die Text-Ansicht
    private JTextArea textDisplayArea;
    private JButton saveTextButton;

    // "Karte" für die Checkbox-Ansicht
    private JPanel checklistPanel;
    private JList<ChecklistItem> checklistJList; // Die Liste für die einzelnen Checkbox-Einträge
    private DefaultListModel<ChecklistItem> checklistModel; // Das Datenmodell für die Checkbox-Liste

    // --- Datenverwaltung ---
    private DataManager dataManager;

    /**
     * Konstruktor der ToDoApp.
     * Initialisiert den DataManager, baut die Benutzeroberfläche auf und lädt vorhandene Daten.
     */
    public ToDoApp() {
        dataManager = new DataManager();
        initUI(); // Methode zum Aufbau der GUI aufrufen
        loadData(); // Methode zum Laden der Daten aufrufen
    }

    /**
     * Initialisiert alle Komponenten der Benutzeroberfläche und ordnet sie im Fenster an.
     */
    private void initUI() {
        // 1. Hauptfenster (Frame) konfigurieren
        frame = new JFrame("Meine ToDo-Listen App");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Wir wollen das Schließen selbst abfangen, um zu speichern
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                saveAndExit(); // Eigene Methode zum Speichern und Beenden aufrufen
            }
        });
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout(10, 10)); // Hauptlayout mit Abständen

        // 2. Linke Liste für die ToDo-Listen-Titel erstellen
        listModel = new DefaultListModel<>();
        toDoListJList = new JList<>(listModel);
        toDoListJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Immer nur eine Liste kann ausgewählt sein
        // Listener hinzufügen, der bei Auswahl einer Liste reagiert
        toDoListJList.addListSelectionListener(e -> {
            // "getValueIsAdjusting" verhindert, dass der Code bei einem Klick doppelt ausgeführt wird
            if (!e.getValueIsAdjusting()) {
                updateDisplayArea(); // Anzeige im mittleren Panel aktualisieren
            }
        });
        JScrollPane listScrollPane = new JScrollPane(toDoListJList); // Scrollbalken hinzufügen
        listScrollPane.setPreferredSize(new Dimension(200, 0)); // Feste Breite für die Liste

        // 3. Zentrales Panel mit CardLayout für die dynamische Anzeige
        cardLayout = new CardLayout();
        centerPanel = new JPanel(cardLayout);

        // 3a. Erste Karte: Panel für die Text-Listen-Ansicht
        JPanel textPanel = new JPanel(new BorderLayout());
        textDisplayArea = new JTextArea();
        textDisplayArea.setFont(new Font("Arial", Font.PLAIN, 16));
        textDisplayArea.setLineWrap(true);
        textDisplayArea.setWrapStyleWord(true);
        saveTextButton = new JButton("Änderungen speichern");
        saveTextButton.addActionListener(e -> saveTextChanges());
        textPanel.add(new JScrollPane(textDisplayArea), BorderLayout.CENTER);
        textPanel.add(saveTextButton, BorderLayout.SOUTH);

        // 3b. Zweite Karte: Panel für die Checkbox-Listen-Ansicht
        checklistPanel = new JPanel(new BorderLayout());
        checklistModel = new DefaultListModel<>();
        checklistJList = new JList<>(checklistModel);
        checklistJList.setCellRenderer(new ChecklistCellRenderer()); // WICHTIG: Unseren eigenen "Maler" für die Einträge verwenden
        checklistJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Listener, der auf Klicks in der Checkbox-Liste reagiert (zum Abhaken)
        checklistJList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int index = checklistJList.locationToIndex(e.getPoint()); // Index des angeklickten Elements ermitteln
                if (index != -1) { // Sicherstellen, dass auf ein Element geklickt wurde
                    ChecklistItem item = checklistModel.getElementAt(index);
                    item.setDone(!item.isDone()); // Status umschalten (erledigt <-> nicht erledigt)
                    sortAndRefreshChecklist();    // Liste neu sortieren und anzeigen
                }
            }
        });
        
        // 3c. Eingabebereich für neue Checklist-Einträge
        JPanel newItemPanel = new JPanel(new BorderLayout(5, 0));
        JTextField newItemField = new JTextField();
        JButton addItemButton = new JButton("Eintrag setzen");

        // Derselbe ActionListener wird für den Button-Klick und die Enter-Taste im Textfeld verwendet
        ActionListener addItemAction = e -> addNewChecklistItem(newItemField);
        addItemButton.addActionListener(addItemAction);
        newItemField.addActionListener(addItemAction);

        newItemPanel.add(newItemField, BorderLayout.CENTER);
        newItemPanel.add(addItemButton, BorderLayout.EAST);

        checklistPanel.add(new JScrollPane(checklistJList), BorderLayout.CENTER);
        checklistPanel.add(newItemPanel, BorderLayout.SOUTH);

        // 3d. Dritte Karte: Ein einfacher Willkommensbildschirm
        JPanel welcomePanel = new JPanel(new GridBagLayout()); // GridBagLayout zentriert das Label schön
        welcomePanel.add(new JLabel("Willkommen! Wähle eine Liste aus oder erstelle eine neue."));

        // Alle "Karten" zum zentralen Panel hinzufügen
        centerPanel.add(welcomePanel, "WELCOME");
        centerPanel.add(textPanel, "TEXT_LIST");
        centerPanel.add(checklistPanel, "CHECK_LIST");

        // 4. Untere Leiste mit den Haupt-Buttons
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.LEFT)); // Buttons werden linksbündig angeordnet
        JButton newListButton = new JButton("Neue Liste");
        newListButton.addActionListener(e -> addNewList());
        JButton deleteListButton = new JButton("Liste löschen");
        deleteListButton.addActionListener(e -> deleteSelectedList());
        bottomPanel.add(newListButton);
        bottomPanel.add(deleteListButton);

        // 5. Alle Haupt-Komponenten dem Frame hinzufügen
        frame.add(listScrollPane, BorderLayout.WEST);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);
        
        // 6. Fenster zentrieren, sichtbar machen und die Willkommens-Karte anzeigen
        frame.setLocationRelativeTo(null);
        cardLayout.show(centerPanel, "WELCOME");
        frame.setVisible(true);
    }
    
    /**
     * Erstellt einen neuen Eintrag in der aktuell angezeigten Checkbox-Liste.
     * @param textField Das Textfeld, aus dem der Text des neuen Eintrags gelesen wird.
     */
    private void addNewChecklistItem(JTextField textField) {
        String text = textField.getText();
        if (!text.trim().isEmpty()) { // Nur hinzufügen, wenn der Text nicht leer ist
            checklistModel.addElement(new ChecklistItem(text.trim()));
            textField.setText(""); // Textfeld nach dem Hinzufügen leeren
            sortAndRefreshChecklist();
        }
    }

    /**
     * Öffnet einen Dialog, um den Benutzer nach Typ und Titel einer neuen ToDo-Liste zu fragen
     * und fügt diese anschließend hinzu.
     */
    private void addNewList() {
        // Dialog zur Auswahl des Listentyps
        Object[] options = {"Text-Liste", "Checkbox-Liste"};
        int choice = JOptionPane.showOptionDialog(frame, "Welchen Typ von Liste möchtest du erstellen?", 
            "Listentyp auswählen", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        if (choice != JOptionPane.CLOSED_OPTION) { // Wenn der Benutzer nicht auf "Abbrechen" geklickt hat
            String title = JOptionPane.showInputDialog(frame, "Wie soll die neue Liste heißen?", "Neue Liste erstellen", JOptionPane.PLAIN_MESSAGE);
            if (title != null && !title.trim().isEmpty()) {
                ToDoList newList;
                if (choice == 0) { // Je nach Auswahl wird das entsprechende Objekt erstellt
                    newList = new TextToDoList(title.trim(), "");
                } else {
                    newList = new CheckboxToDoList(title.trim());
                }
                listModel.addElement(newList); // Neue Liste zum Datenmodell hinzufügen
                toDoListJList.setSelectedValue(newList, true); // Die neue Liste direkt auswählen
            }
        }
    }

    /**
     * Löscht die aktuell in der linken Liste ausgewählte ToDo-Liste nach einer Sicherheitsabfrage.
     */
    private void deleteSelectedList() {
        ToDoList selectedList = toDoListJList.getSelectedValue(); // Ausgewählte Liste holen
        if (selectedList != null) {
            // Sicherheitsabfrage, um versehentliches Löschen zu verhindern
            int response = JOptionPane.showConfirmDialog(frame, "Liste '" + selectedList.getTitle() + "' wirklich löschen?", "Löschen", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                listModel.removeElement(selectedList); // Liste aus dem Modell entfernen
                cardLayout.show(centerPanel, "WELCOME"); // Zurück zum Willkommensbildschirm
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Bitte zuerst eine Liste zum Löschen auswählen.", "Hinweis", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     * Aktualisiert den zentralen Anzeigebereich basierend auf dem Typ der ausgewählten ToDo-Liste.
     * Dies ist die zentrale Logik für die dynamische Anzeige.
     */
    private void updateDisplayArea() {
        ToDoList selectedList = toDoListJList.getSelectedValue();
        if (selectedList == null) {
            cardLayout.show(centerPanel, "WELCOME"); // Wenn nichts ausgewählt ist, zeige den Willkommensbildschirm
            return;
        }

        // Mit "instanceof" wird der Typ des Objekts geprüft
        if (selectedList instanceof TextToDoList) {
            TextToDoList textList = (TextToDoList) selectedList;
            textDisplayArea.setText(textList.getContent());
            cardLayout.show(centerPanel, "TEXT_LIST"); // Zeige die "Text-Karte"
        } else if (selectedList instanceof CheckboxToDoList) {
            CheckboxToDoList checkList = (CheckboxToDoList) selectedList;
            checklistModel.clear(); // Altes Modell leeren
            checkList.getItems().forEach(checklistModel::addElement); // Modell mit den neuen Items füllen
            sortAndRefreshChecklist(); // Initial sortieren
            cardLayout.show(centerPanel, "CHECK_LIST"); // Zeige die "Checkbox-Karte"
        }
    }
    
    /**
     * Speichert den aktuellen Text aus der JTextArea in das ausgewählte TextToDoList-Objekt.
     */
    private void saveTextChanges() {
        ToDoList selectedList = toDoListJList.getSelectedValue();
        if (selectedList instanceof TextToDoList) {
            ((TextToDoList) selectedList).setContent(textDisplayArea.getText());
            JOptionPane.showMessageDialog(frame, "Änderungen gespeichert!");
        }
    }

    /**
     * Synchronisiert das Datenmodell der Checkbox-Liste mit der GUI, sortiert die Einträge
     * und erzwingt eine Neuzeichnung der Anzeige.
     */
    private void sortAndRefreshChecklist() {
        ToDoList selectedList = toDoListJList.getSelectedValue();
        if (selectedList instanceof CheckboxToDoList) {
            CheckboxToDoList list = (CheckboxToDoList) selectedList;
            // 1. Daten von der GUI (checklistModel) zurück ins Backend-Objekt (list) schreiben
            list.getItems().clear();
            for (int i = 0; i < checklistModel.size(); i++) {
                list.getItems().add(checklistModel.getElementAt(i));
            }
            // 2. Die Sortierlogik im Backend-Objekt aufrufen
            list.sortItems();
            
            // 3. GUI mit den sortierten Daten aus dem Backend-Objekt aktualisieren
            checklistModel.clear();
            list.getItems().forEach(checklistModel::addElement);
            checklistJList.repaint(); // Wichtig: Neuzeichnen der Liste erzwingen
        }
    }

    /**
     * Lädt die ToDo-Listen beim Start der Anwendung mithilfe des DataManagers.
     */
    private void loadData() {
        List<ToDoList> loadedLists = dataManager.loadLists();
        for (ToDoList list : loadedLists) {
            listModel.addElement(list);
        }
    }
    
    /**
     * Speichert den aktuellen Zustand aller Listen und beendet die Anwendung.
     * Wird vom WindowListener beim Schließen des Fensters aufgerufen.
     */
    private void saveAndExit() {
        // Alle Elemente aus dem listModel in eine Standard-Java-Liste konvertieren
        List<ToDoList> listsToSave = Collections.list(listModel.elements());
        dataManager.saveLists(listsToSave); // An den DataManager zum Speichern übergeben
        frame.dispose(); // GUI-Ressourcen freigeben
        System.exit(0); // Anwendung sauber beenden
    }

    /**
     * Der Haupteinstiegspunkt der Anwendung.
     * @param args Kommandozeilenargumente (werden hier nicht verwendet).
     */
    public static void main(String[] args) {
        // Stellt sicher, dass der GUI-Code auf dem Event Dispatch Thread (EDT) ausgeführt wird.
        // Das ist eine zwingende Konvention für stabile Swing-Anwendungen.
        SwingUtilities.invokeLater(() -> new ToDoApp());
    }
}