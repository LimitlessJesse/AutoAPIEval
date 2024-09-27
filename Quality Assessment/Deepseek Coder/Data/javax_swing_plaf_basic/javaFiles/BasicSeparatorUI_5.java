import javax.swing.*;
import javax.swing.plaf.basic.BasicSeparatorUI;

public class BasicSeparatorUI_5 {
    public static void main(String[] args) {
        JSeparator separator = new JSeparator();
        BasicSeparatorUI basicSeparatorUI = new BasicSeparatorUI();

        // Install the UI delegate
        basicSeparatorUI.installUI(separator);

        // Uninstall the UI delegate
        basicSeparatorUI.uninstallUI(separator);
    }
}
