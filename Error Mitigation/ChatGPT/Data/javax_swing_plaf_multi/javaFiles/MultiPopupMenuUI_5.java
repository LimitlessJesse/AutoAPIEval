import javax.swing.JComponent;
import javax.swing.plaf.multi.MultiPopupMenuUI;

public class MultiPopupMenuUI_5 {
    public static void main(String[] args) {
        MultiPopupMenuUI multiPopupMenuUI = new MultiPopupMenuUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        multiPopupMenuUI.uninstallUI(component);
    }
}
