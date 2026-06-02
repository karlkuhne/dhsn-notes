package todo;
import javax.swing.*;
import java.awt.*;              //AWT, GUI

/**
 * Textarea funktioniert ganz ähnlich wie das {@link Textfeld}, hat aber noch weitere zusätzliche Eigenschaften
 * und muss daher ein bisschen anders behandelt werden.
 * <p>
 * Anders als alle anderen GUI-Elemente der Aufgabe wird die Textarea nicht von der Aufgabe erstellt, sondern
 * sie erstellt sich selber. Das hat den Hintergrund, da die Textarea zusätzlich noch eine Scrollbar benötigt,
 * die zwingend mit der richtigen Textarea verbunden werden muss. Durch den etwas komplizierteren Aufbau war es am
 * einfachsten, dass die Textarea sich selbst erstellt. <br>
 * Dies hat allerdings auch den Nachteil, dass die Textarea selbst nicht die Methoden einer JTextarea hat,
 * somit ist ein Zugriff von außen auf die Eigenschaften und Methoden erschwert. Dies funktioniert mit überladen,
 * wir haben uns aber dafür entscheiden, einheitlich mit dem Rest des Codes ganz eigene Funktionen dafür zu
 * schreiben, wie löschen() ({@link #loeschen(Aufgabe)}).
 * 
 * @see Textarea#loeschen
*/

public class Textarea {

    public String text = "neue Notiz";
    public JTextArea textArea;
    public JScrollPane scrollPane;

    public Textarea (String text, Tab zugehoerigerTab) {

        this.text = text;

        textArea = new JTextArea();
        textArea.setText(this.text);
        textArea.setFont(new Font("Arial", Font.BOLD, 15));
        textArea.setBounds(90, zugehoerigerTab.yKoordinate, 550, 60);
        textArea.setLineWrap(true); // Automatischer Zeilenumbruch
        textArea.setWrapStyleWord(true); // Wortweiser Umbruch (nicht mitten im Wort)

        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(new Rectangle(90, zugehoerigerTab.yKoordinate, 550, 60));

        zugehoerigerTab.oberflaeche.add(scrollPane);
    }

    /**
     * Wie bereits übergreifend zur Klasse erklärt, ist es Aufgrund des Aufbaus nicht möglich, das Textarea
     * als JTextarea zu behandeln. Deshalb funktioniert der remove()-Aufruf auch nicht und muss daher anders
     * gelöst werden. <br>
     * Dafür wurde die Funktion löschen() geschrieben, die dafür sorgt, dass die JTextarea und ScrollPane dieses
     * Objekts vom Bildschirm verschwinden.
     */

    public void loeschen(Aufgabe aufgabe) {
        aufgabe.zugehoerigerTab.oberflaeche.remove(this.textArea);
        aufgabe.zugehoerigerTab.oberflaeche.remove(this.scrollPane);
        aufgabe.zugehoerigerTab.oberflaeche.revalidate();
        aufgabe.zugehoerigerTab.oberflaeche.repaint();
    }
}