import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicPopupMenuUI;

public class BasicPopupMenuUI_5 {
    public static void main(String[] args) {
        BasicPopupMenuUI popupMenuUI = new BasicPopupMenuUI();
        JComponent component = new JComponent();
        popupMenuUI.uninstallUI(component);
    }
}
