import javax.swing.*;
import javax.swing.plaf.metal.MetalComboBoxUI;
import java.awt.*;

public class MetalComboBoxUI_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MetalComboBoxUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");
        comboBox.addItem("Item 3");

        MetalComboBoxUI<String> metalComboBoxUI = new MetalComboBoxUI<>();
        metalComboBoxUI.installUI(comboBox);

        comboBox.setUI(metalComboBoxUI);

        frame.getContentPane().add(comboBox);
        frame.pack();
        frame.setVisible(true);

        // Paint the JComboBox
        metalComboBoxUI.paint(comboBox.getGraphics(), comboBox);
    }
}
