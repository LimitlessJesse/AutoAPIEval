import javax.swing.*;
import javax.swing.plaf.basic.BasicMenuBarUI;

public class BasicMenuBarUI_2 {
    public static void main(String[] args) {
        JMenuBar menuBar = new JMenuBar();
        
        // Creating an instance of BasicMenuBarUI
        BasicMenuBarUI basicMenuBarUI = new BasicMenuBarUI();
        
        // Uninstalling the UI for the JMenuBar
        basicMenuBarUI.uninstallUI(menuBar);
    }
}
