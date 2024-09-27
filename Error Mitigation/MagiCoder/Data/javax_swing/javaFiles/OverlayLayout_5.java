import javax.swing.*;
import java.awt.*;

public class OverlayLayout_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new OverlayLayout(panel));

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        panel.add(button1);
        panel.add(button2);

        frame.add(panel);
        frame.setVisible(true);

        // Calling layoutContainer method
        panel.getLayout().layoutContainer(panel);
    }
}
