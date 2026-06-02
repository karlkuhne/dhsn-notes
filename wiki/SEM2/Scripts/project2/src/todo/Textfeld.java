package todo;

import javax.swing.*;           //Swing, GUI
import java.awt.*;              //AWT, GUI

/**
 * Das Textfeld erbt von JTextfield und wird von der jeweiligen übergeordneten
 * Aufgabe erstellt.
 * Die {@link Checkbox} der Aufgabe hat die Möglichkeit, auf Methoden der Klasse
 * zuzugreifen und so das Aussehen
 * bei Erledigen von Aufgaben einstellen.
 * 
 * @see Checkbox
 */

public class Textfeld extends JTextField {

    //erstellen des Textfeldes
    public Textfeld(String text, Tab zugehoerigerTab) {
        this.setText(text);
        this.setFont(new Font("Arial", Font.BOLD, 15));
        this.setBounds(90, zugehoerigerTab.yKoordinate, 550, 30);

        //fügt sich zum richtigen Tab hinzu
        zugehoerigerTab.oberflaeche.add(this);
    }
}