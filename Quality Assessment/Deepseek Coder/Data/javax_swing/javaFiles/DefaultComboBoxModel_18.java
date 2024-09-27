import javax.swing.*;
import java.awt.*;

public class DefaultComboBoxModel_18 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ComboBox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a ComboBoxModel
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        model.addElement("Item 1");
        model.addElement("Item 2");
        model.addElement("Item 3");

        // Create a ComboBox
        JComboBox<String> comboBox = new JComboBox<>(model);

        // Set the selected item
        model.setSelectedItem("Item 2");

        // Add the ComboBox to the frame
        frame.getContentPane().add(comboBox, BorderLayout.CENTER);

        // Display the frame
        frame.setVisible(true);
    }
}
