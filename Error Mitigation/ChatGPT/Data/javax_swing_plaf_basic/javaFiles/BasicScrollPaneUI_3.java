import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicScrollPaneUI;

public class BasicScrollPaneUI_3 {
    public static void main(String[] args) {
        BasicScrollPaneUI ui = new BasicScrollPaneUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        ui.uninstallUI(component);
    }
}
