import javax.swing.*;
import javax.swing.plaf.basic.BasicLabelUI;
import java.awt.*;

public class BasicLabelUI_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Label Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello, World!");
        label.setUI(new BasicLabelUI() {
            @Override
            public void paint(Graphics g, JComponent c) {
                super.paint(g, c);
                g.setColor(Color.RED);
                g.drawString("Hello, World!!!", 50, 50);
            }
        });

        frame.getContentPane().add(label);
        frame.pack();
        frame.setVisible(true);
    }
}
