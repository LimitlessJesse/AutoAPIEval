import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicTableHeaderUI;

public class BasicTableHeaderUI_5 {
    public static void main(String[] args) {
        JComponent component = new JComponent();
        BasicTableHeaderUI ui = new BasicTableHeaderUI();
        ui.uninstallUI(component);
    }
}
