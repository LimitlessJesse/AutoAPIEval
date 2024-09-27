import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicSeparatorUI;

public class BasicSeparatorUI_3 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        
        BasicSeparatorUI separatorUI = new BasicSeparatorUI();
        separatorUI.installUI(component);
        
        // Additional code to work with the configured component
    }
}
