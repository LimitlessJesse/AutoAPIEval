import javax.swing.*;
import java.awt.*;

public class OverlayLayout_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("OverlayLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new OverlayLayout());

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        panel.add(button1);
        panel.add(button2);

        frame.getContentPane().add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);

        // Layout the components in the panel
        panel.layoutContainer(panel);
    }
}
