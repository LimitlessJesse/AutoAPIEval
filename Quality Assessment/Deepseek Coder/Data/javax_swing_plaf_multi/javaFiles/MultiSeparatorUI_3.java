import javax.swing.*;
import javax.swing.plaf.multi.MultiSeparatorUI;
import java.awt.*;

public class MultiSeparatorUI_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                MultiSeparatorUI multiSeparatorUI = new MultiSeparatorUI();
                multiSeparatorUI.paint(g, this);
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
