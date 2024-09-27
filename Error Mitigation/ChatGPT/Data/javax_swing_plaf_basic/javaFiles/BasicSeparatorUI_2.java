import javax.swing.plaf.basic.BasicSeparatorUI;
import javax.swing.JComponent;
import java.awt.Graphics;

public class BasicSeparatorUI_2 {
    public static void main(String[] args) {
        BasicSeparatorUI separatorUI = new BasicSeparatorUI();
        JComponent component = new JComponent() {};
        Graphics graphics = component.getGraphics();
        
        separatorUI.paint(graphics, component);
    }
}
