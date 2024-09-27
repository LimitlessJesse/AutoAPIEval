import javax.swing.plaf.basic.BasicBorders;
import javax.swing.*;
import java.awt.*;

public class BasicBorders_SplitPaneBorder_2 {
    public static void main(String[] args) {
        // Create a JPanel to test the paintBorder method
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                BasicBorders.SplitPaneBorder border = new BasicBorders.SplitPaneBorder();
                border.paintBorder(this, g, 0, 0, getWidth(), getHeight());
            }
        };

        // Create a JFrame to display the JPanel
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
