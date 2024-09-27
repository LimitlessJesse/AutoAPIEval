import javax.swing.plaf.basic.BasicPopupMenuSeparatorUI;
import javax.swing.JComponent;
import java.awt.Graphics;

public class BasicPopupMenuSeparatorUI_3 {
    public static void main(String[] args) {
        BasicPopupMenuSeparatorUI separatorUI = new BasicPopupMenuSeparatorUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        Graphics graphics = component.getGraphics(); // Getting the Graphics object from the component
        separatorUI.paint(graphics, component); // Calling the paint method with Graphics and JComponent
    }
}
