import javax.swing.plaf.metal.MetalPopupMenuSeparatorUI;
import javax.swing.JComponent;
import java.awt.Graphics;

public class MetalPopupMenuSeparatorUI_3 {
    public static void main(String[] args) {
        MetalPopupMenuSeparatorUI separatorUI = new MetalPopupMenuSeparatorUI();
        JComponent component = new JComponent() {};
        Graphics graphics = component.getGraphics();
        
        separatorUI.paint(graphics, component);
    }
}
