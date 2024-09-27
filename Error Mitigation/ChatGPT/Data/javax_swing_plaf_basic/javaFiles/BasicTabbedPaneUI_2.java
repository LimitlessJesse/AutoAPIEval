import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class BasicTabbedPaneUI_2 {
    public static void main(String[] args) {
        BasicTabbedPaneUI tabbedPaneUI = new BasicTabbedPaneUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        
        tabbedPaneUI.uninstallUI(component);
    }
}
