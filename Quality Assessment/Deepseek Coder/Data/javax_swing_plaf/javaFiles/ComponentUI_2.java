import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicButtonUI;

public class ComponentUI_2 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");
        ComponentUI ui = button.getUI();

        // Install the UI delegate
        button.setUI(new BasicButtonUI());

        // Uninstall the UI delegate
        ui.uninstallUI(button);
    }
}
