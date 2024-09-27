import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicComboBoxUI;

public class BasicComboBoxUI_2 {
    public static void main(String[] args) {
        BasicComboBoxUI basicComboBoxUI = new BasicComboBoxUI();
        JComponent component = new JComponent() {
        };
        basicComboBoxUI.uninstallUI(component);
    }
}
