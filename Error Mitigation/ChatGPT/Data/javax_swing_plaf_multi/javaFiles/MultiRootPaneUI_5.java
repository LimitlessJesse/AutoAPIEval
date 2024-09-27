import javax.swing.plaf.multi.MultiRootPaneUI;
import java.awt.Graphics;
import javax.swing.JComponent;

public class MultiRootPaneUI_5 {
    public static void main(String[] args) {
        MultiRootPaneUI multiRootPaneUI = new MultiRootPaneUI();
        Graphics graphics = null; // create a Graphics object
        JComponent component = new JComponent(); // create a JComponent object
        multiRootPaneUI.update(graphics, component);
    }
}
