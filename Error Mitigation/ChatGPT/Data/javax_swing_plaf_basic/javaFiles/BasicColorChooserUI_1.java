import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicColorChooserUI;

public class BasicColorChooserUI_1 {
    public static void main(String[] args) {
        BasicColorChooserUI basicColorChooserUI = new BasicColorChooserUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        
        basicColorChooserUI.installUI(component);
        
        // Additional code to verify the installation of UI
        System.out.println("UI installed successfully on component: " + component);
    }
}
