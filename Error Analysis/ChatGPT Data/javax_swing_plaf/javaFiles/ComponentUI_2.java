import javax.swing.plaf.ComponentUI;
import javax.swing.JButton;

public class ComponentUI_2 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");
        ComponentUI ui = button.getUI();
        ui.uninstallUI(button);
        
        // After uninstalling UI, the button should return to default look and behavior
    }
}
