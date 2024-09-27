import javax.swing.*;
import javax.swing.plaf.basic.BasicLabelUI;

public class BasicLabelUI_5 {
    public static void main(String[] args) {
        JLabel label = new JLabel("Hello, World!");
        BasicLabelUI basicLabelUI = new BasicLabelUI();
        basicLabelUI.installUI(label);

        // Change the look and feel
        basicLabelUI.uninstallUI(label);
    }
}
