import javax.swing.*;
import javax.swing.plaf.basic.BasicRadioButtonUI;
import java.awt.*;

public class BasicRadioButtonUI_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JRadioButton radioButton = new JRadioButton("Radio Button");
        radioButton.setUI(new CustomRadioButtonUI());

        frame.getContentPane().add(radioButton);
        frame.setVisible(true);
    }
}

class CustomRadioButtonUI extends BasicRadioButtonUI {
    @Override
    public void paint(Graphics g, JComponent c) {
        super.paint(g, c);

        // Custom painting code goes here
        // For example, let's draw a rectangle around the radio button
        g.setColor(Color.RED);
        g.drawRect(0, 0, c.getWidth() - 1, c.getHeight() - 1);
    }
}
