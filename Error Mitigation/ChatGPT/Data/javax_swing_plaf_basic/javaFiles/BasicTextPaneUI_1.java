import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicTextPaneUI;

public class BasicTextPaneUI_1 {
    public static void main(String[] args) {
        BasicTextPaneUI basicTextPaneUI = new BasicTextPaneUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        basicTextPaneUI.installUI(component);
    }
}
