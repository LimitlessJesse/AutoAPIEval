import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.JComponent;

public class BasicButtonUI_2 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {};
        BasicButtonUI buttonUI = new BasicButtonUI();
        buttonUI.uninstallUI(component);
    }
}
