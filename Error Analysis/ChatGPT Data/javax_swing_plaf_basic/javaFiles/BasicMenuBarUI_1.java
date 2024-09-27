import javax.swing.*;
import javax.swing.plaf.basic.BasicMenuBarUI;

public class BasicMenuBarUI_1 {
    public static void main(String[] args) {
        JMenuBar menuBar = new JMenuBar();
        BasicMenuBarUI basicUI = new BasicMenuBarUI();
        basicUI.installUI(menuBar);
    }
}
