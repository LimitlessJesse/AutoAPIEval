import javax.swing.plaf.multi.MultiMenuItemUI;
import java.awt.Graphics;
import javax.swing.JComponent;

public class MultiMenuItemUI_4 {
    public static void main(String[] args) {
        MultiMenuItemUI multiMenuItemUI = new MultiMenuItemUI();
        Graphics graphics = null; // create a Graphics object
        JComponent component = new JComponent(); // create a JComponent object
        multiMenuItemUI.update(graphics, component);
    }
}
