import javax.swing.*;
import javax.swing.plaf.multi.MultiViewportUI;
import java.awt.*;

public class MultiViewportUI_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                MultiViewportUI multiViewportUI = new MultiViewportUI();
                multiViewportUI.paint(g, this);
            }
        };

        frame.add(panel);
    }
}
