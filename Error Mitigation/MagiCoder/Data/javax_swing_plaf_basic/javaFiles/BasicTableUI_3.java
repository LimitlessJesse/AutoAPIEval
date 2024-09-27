import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicTableUI;

public class BasicTableUI_3 {
    public static void main(String[] args) {
        JComponent component = new JComponent();
        BasicTableUI basicTableUI = new BasicTableUI();
        basicTableUI.uninstallUI(component);
    }
}
