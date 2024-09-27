import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.multi.MultiTabbedPaneUI;

public class MultiTabbedPaneUI_1 {
    public static void main(String[] args) {
        MultiTabbedPaneUI multiTabbedPaneUI = new MultiTabbedPaneUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        ComponentUI ui = multiTabbedPaneUI.createUI(component);
        // Use the created ComponentUI as needed
    }
}
