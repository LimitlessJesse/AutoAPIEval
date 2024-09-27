import javax.swing.*;
import javax.swing.plaf.multi.MultiMenuBarUI;

public class MultiMenuBarUI_6 {
    public static void main(String[] args) {
        JMenuBar menuBar = new JMenuBar();
        MultiMenuBarUI multiMenuBarUI = new MultiMenuBarUI();
        multiMenuBarUI.uninstallUI(menuBar);
    }
}
