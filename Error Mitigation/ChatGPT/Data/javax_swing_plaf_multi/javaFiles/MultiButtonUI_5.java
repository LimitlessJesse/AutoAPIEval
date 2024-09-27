import javax.swing.plaf.multi.MultiButtonUI;
import java.awt.Graphics;
import javax.swing.JComponent;

public class MultiButtonUI_5 {
    public static void main(String[] args) {
        MultiButtonUI multiButtonUI = new MultiButtonUI();
        Graphics graphics = null; // provide a Graphics context
        JComponent component = new JComponent(); // provide a JComponent
        multiButtonUI.paint(graphics, component);
    }
}
