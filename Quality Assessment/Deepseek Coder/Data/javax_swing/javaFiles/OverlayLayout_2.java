import javax.swing.*;
import java.awt.*;

public class OverlayLayout_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new OverlayLayout());

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        panel.add(button1);
        panel.add(button2);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);

        Dimension preferredSize = panel.getPreferredSize();
        System.out.println("Preferred size: " + preferredSize);
    }
}
