import javax.swing.JRootPane;
import javax.swing.plaf.basic.BasicRootPaneUI;

public class BasicRootPaneUI_5 {
    public static void main(String[] args) {
        JRootPane root = new JRootPane();
        BasicRootPaneUI ui = new BasicRootPaneUI();
        ui.installDefaults(root);
    }
}
