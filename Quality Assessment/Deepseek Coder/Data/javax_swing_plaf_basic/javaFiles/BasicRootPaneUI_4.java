import javax.swing.*;
import javax.swing.plaf.basic.BasicRootPaneUI;

public class BasicRootPaneUI_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        BasicRootPaneUI ui = new BasicRootPaneUI();
        frame.setUndecorated(true);
        frame.setSize(300, 200);
        frame.setVisible(true);
        ui.installUI(frame);
        ui.uninstallUI(frame);
    }
}
