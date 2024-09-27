import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicDesktopPaneUI;
import java.awt.Dimension;

public class BasicDesktopPaneUI_4 {
    public static void main(String[] args) {
        BasicDesktopPaneUI ui = new BasicDesktopPaneUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        Dimension minimumSize = ui.getMinimumSize(component);
        System.out.println("Minimum size: " + minimumSize);
    }
}
