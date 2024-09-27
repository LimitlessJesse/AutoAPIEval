import javax.swing.JComponent;
import javax.swing.plaf.multi.MultiPopupMenuUI;

public class MultiPopupMenuUI_5 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {};
        MultiPopupMenuUI ui = new MultiPopupMenuUI();
        ui.uninstallUI(component);
    }
}
