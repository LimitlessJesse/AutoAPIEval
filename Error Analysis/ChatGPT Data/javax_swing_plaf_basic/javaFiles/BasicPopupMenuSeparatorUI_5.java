import javax.swing.plaf.basic.BasicPopupMenuSeparatorUI;
import javax.swing.*;

public class BasicPopupMenuSeparatorUI_5 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {}; // Create a dummy JComponent
        Graphics graphics = component.getGraphics(); // Get the graphics object
        
        BasicPopupMenuSeparatorUI separatorUI = new BasicPopupMenuSeparatorUI();
        separatorUI.paint(graphics, component); // Call the paint method
    }
}
