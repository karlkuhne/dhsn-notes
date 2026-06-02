package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Eine ToDo-Liste, die aus einzelnen Einträgen mit Checkboxen besteht.
 * Erbt von ToDoList und ist somit serialisierbar.
 */
public class CheckboxToDoList extends ToDoList {
    private static final long serialVersionUID = 1L;
    private List<ChecklistItem> items;

    public CheckboxToDoList(String title) {
        super(title);
        this.items = new ArrayList<>();
    }

    public List<ChecklistItem> getItems() {
        return items;
    }

    public void addItem(ChecklistItem item) {
        this.items.add(item);
    }
    
    public void removeItem(ChecklistItem item) {
        this.items.remove(item);
    }

    /**
     * Sortiert die Liste so, dass alle erledigten Einträge (done = true)
     * am Ende der Liste stehen.
     */
    public void sortItems() {
        // Verwendet einen Comparator, um zuerst nach "nicht erledigt" (false), 
        // dann nach "erledigt" (true) zu sortieren.
        items.sort(Comparator.comparing(ChecklistItem::isDone));
    }
}
