import javax.swing.*;
import javax.swing.plaf.multi.MultiToolBarUI;

public class MultiToolBarUI_3 {
    public static void main(String[] args) {
        JToolBar toolBar = new JToolBar();
        MultiToolBarUI multiToolBarUI = new MultiToolBarUI();
        multiToolBarUI.uninstallUI(toolBar);
    }
}
