package model;

import java.io.Serializable;

/**
 * Abstrakte Basisklasse für alle Arten von ToDo-Listen.
 * Sie implementiert Serializable, damit Objekte dieser Klasse gespeichert werden können.
 */
public abstract class ToDoList implements Serializable {

    // Eine Versionsnummer für die Serialisierung.
    private static final long serialVersionUID = 1L;
    
    protected String title;

    public ToDoList(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    @Override
    public String toString() {
        return this.title;
    }
}
