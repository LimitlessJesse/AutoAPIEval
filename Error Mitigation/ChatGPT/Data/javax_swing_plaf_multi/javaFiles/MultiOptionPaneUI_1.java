import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.multi.MultiOptionPaneUI;
import javax.swing.JComponent;

public class MultiOptionPaneUI_1 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        
        ComponentUI ui = MultiOptionPaneUI.createUI(component);
        System.out.println("UI instance created: " + ui.toString());
    }
}
