import javax.swing.*;
import javax.swing.plaf.metal.MetalRadioButtonUI;
import java.awt.*;

public class MetalRadioButtonUI_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Radio Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JRadioButton radioButton = new JRadioButton("Radio Button");
        radioButton.setUI(new MetalRadioButtonUI() {
            @Override
            public void paint(Graphics g, JComponent c) {
                super.paint(g, c);
                if (c.isEnabled() && model.isPressed()) {
                    g.setColor(Color.RED);
                    g.fillOval(2, 2, c.getWidth() - 5, c.getHeight() - 5);
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(radioButton);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
