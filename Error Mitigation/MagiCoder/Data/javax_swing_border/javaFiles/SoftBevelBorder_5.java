import javax.swing.*;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;

public class SoftBevelBorder_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JPanel panel = new JPanel();
        panel.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
        panel.setPreferredSize(new Dimension(100, 100));

        frame.add(panel);
        frame.setVisible(true);
    }
}
