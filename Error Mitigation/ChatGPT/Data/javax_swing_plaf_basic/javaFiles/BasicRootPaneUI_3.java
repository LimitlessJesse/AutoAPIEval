import javax.swing.JRootPane;
import javax.swing.plaf.basic.BasicRootPaneUI;

public class BasicRootPaneUI_3 {
    public static void main(String[] args) {
        JRootPane rootPane = new JRootPane();
        BasicRootPaneUI ui = new BasicRootPaneUI();
        ui.installDefaults(rootPane);
    }
}
