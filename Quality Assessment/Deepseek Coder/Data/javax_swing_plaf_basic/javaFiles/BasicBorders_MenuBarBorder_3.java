import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;

public class BasicBorders_MenuBarBorder_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                BasicBorders.MenuBarBorder border = new BasicBorders.MenuBarBorder();
                border.paintBorder(this, g, 0, 0, getWidth(), getHeight());
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
