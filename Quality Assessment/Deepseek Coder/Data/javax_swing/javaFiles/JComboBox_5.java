import javax.swing.*;
import java.awt.event.*;

public class JComboBox_5 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();

        // Add items to the combo box
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");
        comboBox.addItem("Item 3");

        // Create an action listener
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Action performed");
            }
        };

        // Add the action listener to the combo box
        comboBox.addActionListener(actionListener);

        // Remove the action listener from the combo box
        comboBox.removeActionListener(actionListener);
    }
}
