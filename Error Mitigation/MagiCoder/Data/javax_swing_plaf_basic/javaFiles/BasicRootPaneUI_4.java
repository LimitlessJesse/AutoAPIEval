import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicRootPaneUI;

public class BasicRootPaneUI_4 {
    public static void main(String[] args) {
        JComponent component = new JComponent();
        BasicRootPaneUI ui = new BasicRootPaneUI();
        ui.uninstallUI(component);
    }
}
