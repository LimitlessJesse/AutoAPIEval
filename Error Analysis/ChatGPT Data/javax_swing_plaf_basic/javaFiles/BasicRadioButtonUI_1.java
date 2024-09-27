import javax.swing.*;
import javax.swing.plaf.basic.BasicRadioButtonUI;

public class BasicRadioButtonUI_1 {
    public static void main(String[] args) {
        JRadioButton radioButton = new JRadioButton();
        BasicRadioButtonUI ui = new BasicRadioButtonUI();
        ui.installDefaults(radioButton);
    }
}
