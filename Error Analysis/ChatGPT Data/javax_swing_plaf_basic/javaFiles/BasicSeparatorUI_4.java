import javax.swing.plaf.basic.BasicSeparatorUI;
import javax.swing.*;

public class BasicSeparatorUI_4 {
    public static void main(String[] args) {
        // Create a JComponent
        JComponent component = new JLabel("Separator");

        // Create an instance of BasicSeparatorUI
        BasicSeparatorUI separatorUI = new BasicSeparatorUI();

        // Create a Graphics object
        Graphics graphics = component.getGraphics();

        // Call the paint method
        separatorUI.paint(graphics, component);
    }
}
