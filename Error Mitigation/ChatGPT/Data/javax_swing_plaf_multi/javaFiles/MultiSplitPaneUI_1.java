import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.multi.MultiSplitPaneUI;
import javax.swing.JComponent;

public class MultiSplitPaneUI_1 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        
        ComponentUI ui = MultiSplitPaneUI.createUI(component);
        System.out.println("UI instance created: " + ui.toString());
    }
}
