import javax.swing.*;
import javax.swing.plaf.basic.BasicMenuBarUI;

public class BasicMenuBarUI_5 {
    public static void main(String[] args) {
        JMenuBar menuBar = new JMenuBar();
        BasicMenuBarUI basicMenuBarUI = new BasicMenuBarUI();
        basicMenuBarUI.installUI(menuBar);
    }
}
