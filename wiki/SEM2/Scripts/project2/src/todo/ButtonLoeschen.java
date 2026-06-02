package todo;

import javax.swing.*;

/**
 * Dient dazu, die jeweilige Aufgabe zu löschen.
 * Da das Objekt von der Klasse JButton erbt, wird zuallererst ein Button
 * (JButton) von der übergeordneten Aufgabe erstellt.
 * Der ButtonLoeschen selbst bekommt beim Erstellen noch ein Objekt übergeben,
 * das übergeordnete Objekt "{@link Aufgabe}".
 * So weiß der Button, zu welcher Aufgabe er gehört und kann entsprechend dessen
 * Methoden einfach aufrufen - in dem Fall {@link Aufgabe#loeschen}.
 * 
 * @see Aufgabe
 * @see Aufgabe#loeschen
 */

public class ButtonLoeschen extends JButton {

    public Aufgabe aufgabe;

    public ButtonLoeschen(Aufgabe aufgabe, Tab zugehoerigerTab) {

        this.aufgabe = aufgabe;
        
        //Button zum Löschen der Aufgabe
        this.setBounds(700, zugehoerigerTab.yKoordinate,50,30);
        this.setText("x");

        zugehoerigerTab.oberflaeche.add(this);

        //Befehl zum Löschen
        this.addActionListener((h) ->{
            aufgabe.loeschen();
        });
    }
}
