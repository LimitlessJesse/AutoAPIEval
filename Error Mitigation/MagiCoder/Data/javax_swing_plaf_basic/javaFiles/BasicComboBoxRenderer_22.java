import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxRenderer;
import java.awt.*;

public class BasicComboBoxRenderer_22 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");
        comboBox.addItem("Item 3");

        BasicComboBoxRenderer renderer = new BasicComboBoxRenderer();
        renderer.setSelected(true);
        renderer.setIcon(comboBox.getItemIcon());
        renderer.setForeground(comboBox.getForeground());
        renderer.setBackground(comboBox.getBackground());
        renderer.setFont(comboBox.getFont());
        renderer.setBorder(comboBox.getBorder());
        renderer.setOpaque(comboBox.isOpaque());
        renderer.setComponentOrientation(comboBox.getComponentOrientation());

        Dimension preferredSize = renderer.getPreferredSize();
        System.out.println("Preferred Size: " + preferredSize);
    }
}
