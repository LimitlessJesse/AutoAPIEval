import javax.swing.plaf.ComponentUI;
import javax.swing.JComponent;
import javax.swing.plaf.multi.MultiMenuBarUI;

public class MultiMenuBarUI_1 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        ComponentUI ui = MultiMenuBarUI.createUI(component);
        System.out.println("UI instance created: " + ui.toString());
    }
}
