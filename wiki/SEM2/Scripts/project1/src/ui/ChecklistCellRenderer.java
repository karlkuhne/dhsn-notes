package ui;

import model.ChecklistItem;
import javax.swing.*;
import java.awt.*;

/**
 * Ein benutzerdefinierter Renderer, um ChecklistItem-Objekte in einer JList darzustellen.
 * Diese Klasse rendert jeden Listeneintrag als ein Panel, das eine JCheckBox und ein JLabel enthält.
 */
public class ChecklistCellRenderer extends JPanel implements ListCellRenderer<ChecklistItem> {

    private JCheckBox checkBox;
    private JLabel label;

    public ChecklistCellRenderer() {
        super(new BorderLayout());
        checkBox = new JCheckBox();
        label = new JLabel();
        
        // Schriftart und Stil für den Text
        label.setFont(new Font("Arial", Font.PLAIN, 14));
        
        // Checkbox und Label zum Panel hinzufügen
        add(checkBox, BorderLayout.WEST);
        add(label, BorderLayout.CENTER);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends ChecklistItem> list, ChecklistItem value, int index,
                                                  boolean isSelected, boolean cellHasFocus) {
        
        // Daten aus dem ChecklistItem-Objekt übernehmen
        checkBox.setSelected(value.isDone());

        // Logik für das Durchstreichen des Textes
        if (value.isDone()) {
            // verpacken den Text in HTML-Tags, um ihn durchzustreichen.
            label.setText("<html><s>" + value.getText() + "</s></html>");
            label.setForeground(Color.GRAY); // Textfarbe bleibt grau
        } else {
            // Normaler Text, wenn der Eintrag nicht erledigt ist.
            label.setText(value.getText());
            label.setForeground(list.getForeground());
        }

        // Farben für ausgewählte und nicht ausgewählte Einträge setzen
        if (isSelected) {
            setBackground(list.getSelectionBackground());
        } else {
            setBackground(list.getBackground());
        }

        setEnabled(list.isEnabled());
        return this;
    }
}
