import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicComboBoxEditor_2 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");

        comboBox.setEditor(new BasicComboBoxEditor(comboBox));

        comboBox.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox<?> cb = (JComboBox<?>)e.getSource();
                System.out.println("Action performed: " + cb.getSelectedItem());
            }
        });
    }
}
