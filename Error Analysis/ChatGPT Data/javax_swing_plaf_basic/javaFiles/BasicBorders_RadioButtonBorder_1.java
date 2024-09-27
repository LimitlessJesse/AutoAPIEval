import javax.swing.plaf.basic.BasicBorders;
import javax.swing.*;
import java.awt.*;

public class BasicBorders_RadioButtonBorder_1 {
    public static void main(String[] args) {
        // Create a JFrame to paint the border on
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Create a custom component to apply the border on
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                paintBorder(this, g, 0, 0, getWidth(), getHeight());
            }
        };
        panel.setBackground(Color.WHITE);
        frame.add(panel);
    }

    public static void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        BasicBorders.RadioButtonBorder border = new BasicBorders.RadioButtonBorder(Color.BLACK, Color.GRAY);
        border.paintBorder(c, g, x, y, width, height);
    }
}
