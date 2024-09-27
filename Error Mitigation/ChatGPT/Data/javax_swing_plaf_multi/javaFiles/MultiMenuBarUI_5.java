import javax.swing.plaf.multi.MultiMenuBarUI;
import java.awt.Graphics;
import javax.swing.JComponent;

public class MultiMenuBarUI_5 {
    public static void main(String[] args) {
        MultiMenuBarUI multiMenuBarUI = new MultiMenuBarUI();
        Graphics graphics = null; // provide a Graphics context
        JComponent component = new JComponent(); // provide a JComponent
        multiMenuBarUI.update(graphics, component);
    }
}
