import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicProgressBarUI;

public class BasicProgressBarUI_4 {
    public static void main(String[] args) {
        JComponent component = new JComponent();
        BasicProgressBarUI ui = new BasicProgressBarUI();
        ui.uninstallUI(component);
    }
}
