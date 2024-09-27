import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicTextUI;

public class BasicTextUI_2 {
    public static void main(String[] args) {
        BasicTextUI basicTextUI = new BasicTextUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        basicTextUI.uninstallUI(component);
    }
}
