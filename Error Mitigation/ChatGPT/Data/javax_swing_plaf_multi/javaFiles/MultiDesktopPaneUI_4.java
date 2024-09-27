import javax.swing.plaf.multi.MultiDesktopPaneUI;
import java.awt.Graphics;
import javax.swing.JComponent;

public class MultiDesktopPaneUI_4 {
    public static void main(String[] args) {
        MultiDesktopPaneUI multiDesktopPaneUI = new MultiDesktopPaneUI();
        Graphics graphics = null; // provide a Graphics context
        JComponent component = new JComponent(); // provide a JComponent
        multiDesktopPaneUI.update(graphics, component);
    }
}
