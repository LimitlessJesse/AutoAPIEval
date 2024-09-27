import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;

public class BasicBorders_SplitPaneBorder_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        panel.add(button1, BorderLayout.NORTH);
        panel.add(button2, BorderLayout.SOUTH);

        BasicBorders.SplitPaneBorder border = new BasicBorders.SplitPaneBorder();
        border.paintBorder(panel, panel.getGraphics(), 0, 0, panel.getWidth(), panel.getHeight());

        frame.add(panel);
        frame.setVisible(true);
    }
}
