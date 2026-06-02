package model;

import java.io.Serializable;

/**
 * Repräsentiert einen einzelnen Eintrag in einer Checkbox-Liste.
 * Muss Serializable sein, damit es gespeichert werden kann.
 */
public class ChecklistItem implements Serializable {
    private static final long serialVersionUID = 1L;
    private String text;
    private boolean done;

    public ChecklistItem(String text) {
        this(text, false);
    }

    public ChecklistItem(String text, boolean isDone) {
        this.text = text;
        this.done = isDone;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return (done ? "[x] " : "[ ] ") + text;
    }
}
