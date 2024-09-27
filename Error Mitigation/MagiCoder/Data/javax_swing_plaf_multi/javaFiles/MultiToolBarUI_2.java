import javax.swing.*;
import javax.swing.plaf.multi.MultiToolBarUI;

public class MultiToolBarUI_2 {
    public static void main(String[] args) {
        JToolBar toolBar = new JToolBar();
        MultiToolBarUI multiToolBarUI = new MultiToolBarUI();
        multiToolBarUI.installUI(toolBar);
    }
}
