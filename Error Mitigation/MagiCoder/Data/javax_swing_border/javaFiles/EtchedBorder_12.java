import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;

public class EtchedBorder_12 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBorder(new EtchedBorder());
        panel.setPreferredSize(new Dimension(200, 200));

        frame.add(panel);
        frame.setVisible(true);

        Graphics g = panel.getGraphics();
        int x = 10;
        int y = 10;
        int width = 100;
        int height = 100;

        EtchedBorder border = new EtchedBorder();
        border.paintBorder(panel, g, x, y, width, height);
    }
}
