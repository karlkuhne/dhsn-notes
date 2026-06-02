package todo;

import javax.swing.*;           //Swing, GUI
import java.awt.*;              //AWT, GUI

/**
 * Die Checkbox dient dazu, eledigte Aufgaben abhaken zu können, sodass visuell
 * sichtbar ist, ob eine Aufgabe
 * bereits schon getan ist oder nicht. Das Abhaken einer Aufgabe löscht sie
 * nicht automatisch.
 * <p>
 * Die Checkbox erbt von der Klasse JCheckbox und wird entsprechend von einer
 * übergeordneten Aufgabe erstellt.
 * <p>
 * @see Checkbox#ausgewaehlt
 * @see Textfeld
 * @see Tab
 */

public class Checkbox extends JCheckBox{

    public Textfeld textfeld;

    /**
     * Zusätzlich bekommt sie drei Parameter übergeben. Einmal ein Objekt {@link Textfeld}
     * und einmal den Status und den {@link Tab} der Aufgabe,
     * damit es die richtige yKoordinate nehmen kann.
     * Das Textfeld ist nötig, damit die Checkbox weiß, zu welcher Aufgabe sie
     * gehört und welches Textfeld sie
     * umzeichnen muss. Die Übergabe erleichtert das Ausführen von Methoden und
     * Ändern der Eigenschaften enorm.
     * Der Status ist wichtig, sollte die Aufgabe gespeichert worden sein und neu
     * geladen werden, dass die Checkbox auch
     * entsprechend wie gespeichert ausgewählt ist.
     * <p>
     * Die Funktion {@link Checkbox#ausgewaehlt()} stellt entsprechend das Verhalten sicher, was
     * passiert, wenn die Checkbox ausgeählt ist.
     * So wird bei Auswahl die Schrift des zugehörigen Textfelds grau gefärbt.
     *
     * @param textfeld        Textfeld der zugehörigen Aufgabe, um bei Statusänderung das Aussehen zu ändern.
     * @param status          Gespeicherter Status der Aufgabe (bei Laden notwendig).
     * @param zugehoerigerTab Tab der Aufgabe, zu der die Checkbox gehört.
     *
     * @see Checkbox#ausgewaehlt
     * @see Textfeld
     * @see Tab
     */

    public Checkbox(Textfeld textfeld, Boolean status, Tab zugehoerigerTab) {

        //Aufgabe bekommt ein Textfeld
        this.textfeld = textfeld;

        //erstellen der dazugehörigen Checkbox
        this.setBounds(50, zugehoerigerTab.yKoordinate, 30, 30);
        
        zugehoerigerTab.oberflaeche.add(this);

        //setzt den Status der Checkbox
        this.setSelected(status);
        this.ausgewaehlt();

        //ActionListener → Was soll Checkbox tun, wenn er angeklickt ist?
        this.addActionListener((h) ->  {
            this.ausgewaehlt();
        });
    }

    /**
     * Je nachdem, ob die Checkbox ausgewählt ist, wird das Textfeld eingefärbt oder nicht.
     */

    public void ausgewaehlt() {
        if (this.isSelected()) {
            //Wenn ausgewählt/abgehakt, dann grau
            textfeld.setForeground(Color.GRAY);
        } 
        else {
            //Standard, wenn nicht abgehakt
            textfeld.setForeground(Color.BLACK);
        }

        //kann kein Neusortieren initiieren, da sonst zu Beginn Absturz wegen Kreisreferenz
    }
}
