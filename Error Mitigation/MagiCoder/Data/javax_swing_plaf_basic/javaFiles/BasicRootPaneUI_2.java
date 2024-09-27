import javax.swing.JRootPane;
import javax.swing.plaf.basic.BasicRootPaneUI;

public class BasicRootPaneUI_2 {
    public static void main(String[] args) {
        JRootPane rootPane = new JRootPane();
        BasicRootPaneUI basicRootPaneUI = new BasicRootPaneUI();
        basicRootPaneUI.uninstallDefaults(rootPane);
    }
}
