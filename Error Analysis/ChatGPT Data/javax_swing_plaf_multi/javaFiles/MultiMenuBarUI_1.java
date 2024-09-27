import javax.swing.plaf.ComponentUI;
import javax.swing.JComponent;
import javax.swing.plaf.multi.MultiMenuBarUI;

public class MultiMenuBarUI_1 {
    public static void main(String[] args) {
        MultiMenuBarUI multiMenuBarUI = new MultiMenuBarUI();
        JComponent component = new JComponent() {}; // creating a dummy JComponent for demonstration
        
        ComponentUI ui = multiMenuBarUI.createUI(component);
        System.out.println(ui.toString());
    }
}
