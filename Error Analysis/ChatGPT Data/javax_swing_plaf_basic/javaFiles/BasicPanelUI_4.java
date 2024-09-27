import javax.swing.*;
import javax.swing.plaf.basic.BasicPanelUI;

public class BasicPanelUI_4 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");
        
        // Adding UI property settings to the button
        BasicPanelUI ui = new BasicPanelUI();
        ui.installUI(button);
        
        // Removing UI property settings from the button
        ui.uninstallUI(button);
    }
}
