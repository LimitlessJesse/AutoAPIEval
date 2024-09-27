import javax.swing.JComponent;
import javax.swing.plaf.multi.MultiTabbedPaneUI;
import java.awt.Graphics;

public class MultiTabbedPaneUI_5 {
    public static void main(String[] args) {
        MultiTabbedPaneUI multiTabbedPaneUI = new MultiTabbedPaneUI();
        Graphics g = null; // You need to provide a Graphics object
        JComponent c = null; // You need to provide a JComponent object
        multiTabbedPaneUI.update(g, c);
    }
}
