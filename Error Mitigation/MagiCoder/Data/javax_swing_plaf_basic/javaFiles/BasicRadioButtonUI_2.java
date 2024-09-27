import javax.swing.*;
import javax.swing.plaf.basic.BasicRadioButtonUI;
import java.awt.*;

public class BasicRadioButtonUI_2 {
    public static void main(String[] args) {
        JRadioButton radioButton = new JRadioButton();
        BasicRadioButtonUI radioButtonUI = new BasicRadioButtonUI();
        radioButtonUI.paint(new JComponent() {
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                // Your custom painting code here
            }
        }, radioButton);
    }
}
