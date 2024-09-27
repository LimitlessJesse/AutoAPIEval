import javax.swing.plaf.basic.BasicProgressBarUI;
import javax.swing.JComponent;
import java.awt.Graphics;

public class BasicProgressBarUI_5 {
    public static void main(String[] args) {
        BasicProgressBarUI progressBarUI = new BasicProgressBarUI();
        JComponent component = new JComponent() {};
        Graphics graphics = component.getGraphics();
        
        progressBarUI.paintIndeterminate(graphics, component);
    }
}
