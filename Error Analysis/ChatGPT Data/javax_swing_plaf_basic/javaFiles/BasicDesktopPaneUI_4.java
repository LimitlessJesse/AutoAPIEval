import javax.swing.plaf.basic.BasicDesktopPaneUI;
import javax.swing.JComponent;

public class BasicDesktopPaneUI_4 {
    public static void main(String[] args) {
        BasicDesktopPaneUI ui = new BasicDesktopPaneUI();
        JComponent component = new JComponent() {}; // Creating a sample JComponent
        ui.uninstallUI(component);
    }
}
