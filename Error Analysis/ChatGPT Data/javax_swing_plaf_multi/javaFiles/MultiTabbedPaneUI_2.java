import javax.swing.JComponent;
import javax.swing.plaf.multi.MultiTabbedPaneUI;

public class MultiTabbedPaneUI_2 {
    public static void main(String[] args) {
        // Create an instance of MultiTabbedPaneUI
        MultiTabbedPaneUI tabUI = new MultiTabbedPaneUI();

        // Create a JComponent to install UI on
        JComponent component = new JComponent() {};

        // Install the UI on the JComponent
        tabUI.installUI(component);
    }
}
