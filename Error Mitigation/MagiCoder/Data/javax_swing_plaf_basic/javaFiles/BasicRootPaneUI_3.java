import javax.swing.*;
import javax.swing.plaf.basic.BasicRootPaneUI;

public class BasicRootPaneUI_3 {
    public static void main(String[] args) {
        JRootPane rootPane = new JRootPane();
        BasicRootPaneUI basicRootPaneUI = new BasicRootPaneUI();
        basicRootPaneUI.installUI(rootPane);
    }
}
