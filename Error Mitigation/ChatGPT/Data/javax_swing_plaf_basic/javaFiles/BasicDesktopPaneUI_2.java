import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicDesktopPaneUI;

public class BasicDesktopPaneUI_2 {
    public static void main(String[] args) {
        BasicDesktopPaneUI ui = new BasicDesktopPaneUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        ui.uninstallUI(component);
    }
}
