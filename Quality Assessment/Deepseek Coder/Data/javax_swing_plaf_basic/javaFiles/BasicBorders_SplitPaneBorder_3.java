import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;

public class BasicBorders_SplitPaneBorder_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                paintBorder(this, g, 0, 0, getWidth(), getHeight());
            }

            private void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                BasicBorders.SplitPaneBorder border = new BasicBorders.SplitPaneBorder();
                border.paintBorder(c, g, x, y, width, height);
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
