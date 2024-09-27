import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicLabelUI;

public class BasicLabelUI_2 {
    public static void main(String[] args) {
        BasicLabelUI basicLabelUI = new BasicLabelUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        
        basicLabelUI.uninstallUI(component);
    }
}
