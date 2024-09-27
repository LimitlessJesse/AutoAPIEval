import javax.swing.*;
import javax.swing.plaf.basic.BasicTextPaneUI;

public class BasicTextPaneUI_4 {
    public static void main(String[] args) {
        JTextPane textPane = new JTextPane();
        BasicTextPaneUI textPaneUI = new BasicTextPaneUI();
        textPaneUI.installUI(textPane);
        // Additional code or operations can be performed here
    }
}
