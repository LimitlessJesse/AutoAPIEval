import javax.swing.*;
import java.awt.*;

public class JScrollBar_12 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JScrollBar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 10, 0, 100);
        scrollBar.setPreferredSize(new Dimension(200, 30));
        scrollBar.setVisibleAmount(20);

        JPanel panel = new JPanel();
        panel.add(scrollBar);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
