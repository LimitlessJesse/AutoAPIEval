import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;

public class AbstractBorder_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JPanel panel = new JPanel();
        panel.setBorder(new AbstractBorder() {
            @Override
            public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                g.setColor(Color.RED);
                g.drawRect(x, y, width - 1, height - 1);
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
