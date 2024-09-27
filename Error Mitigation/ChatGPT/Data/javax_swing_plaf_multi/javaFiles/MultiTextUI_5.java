import javax.swing.plaf.multi.MultiTextUI;
import java.awt.Graphics;
import javax.swing.JComponent;

public class MultiTextUI_5 {
    public static void main(String[] args) {
        MultiTextUI multiTextUI = new MultiTextUI();
        Graphics graphics = null; // create a Graphics context
        JComponent component = new JComponent(); // create a JComponent
        multiTextUI.paint(graphics, component);
    }
}
