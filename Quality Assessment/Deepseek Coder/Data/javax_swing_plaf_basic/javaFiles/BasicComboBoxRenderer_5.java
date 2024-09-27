import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxRenderer;
import java.awt.*;

public class BasicComboBoxRenderer_5 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");
        comboBox.addItem("Item 3");

        BasicComboBoxRenderer renderer = new BasicComboBoxRenderer();
        renderer.setSelectedItem(comboBox.getSelectedItem());
        renderer.setForeground(comboBox.getForeground());
        renderer.setBackground(comboBox.getBackground());

        Dimension preferredSize = renderer.getPreferredSize();
        System.out.println("Preferred size: " + preferredSize);
    }
}
