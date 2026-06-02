package model;

/**
 * Eine konkrete Implementierung einer ToDo-Liste als Fließtext.
 * Erbt von ToDoList und ist somit automatisch auch Serializable.
 */
public class TextToDoList extends ToDoList {

    private static final long serialVersionUID = 1L;

    private String content;

    public TextToDoList(String title, String content) {
        super(title); 
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
