import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicSeparatorUI;

public class BasicSeparatorUI_2 {
    public static void main(String[] args) {
        // Assuming c is an instance of JComponent
        uninstallUI(c);
    }

    public static void uninstallUI(JComponent c) {
        BasicSeparatorUI ui = (BasicSeparatorUI) c.getUI();
        ui.uninstallUI(c);
    }
}
