import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;

public class BasicButtonUI_1 {
    public static void main(String[] args) {
        JButton button = new JButton("Click Me");
        BasicButtonUI buttonUI = new BasicButtonUI();
        buttonUI.installUI(button);
    }
}
