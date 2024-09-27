import javax.swing.*;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.awt.*;

public class BasicSplitPaneUI_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                BasicSplitPaneUI ui = new BasicSplitPaneUI();
                ui.paint(g, this);
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
