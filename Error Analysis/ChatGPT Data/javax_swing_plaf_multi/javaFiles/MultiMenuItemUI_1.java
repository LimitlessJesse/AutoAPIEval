import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.multi.MultiMenuItemUI;

public class MultiMenuItemUI_1 {
    public static void main(String[] args) {
        // Create an instance of MultiMenuItemUI
        MultiMenuItemUI multiMenuItemUI = new MultiMenuItemUI();
        
        // Create a JComponent
        JComponent component = new JComponent() {};
        
        // Use createUI method to create ComponentUI for the JComponent
        ComponentUI ui = multiMenuItemUI.createUI(component);
        
        // Display the created ComponentUI
        System.out.println(ui);
    }
}
