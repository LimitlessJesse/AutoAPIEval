import javax.swing.*;
import java.awt.*;

public class OverlayLayout_1 {
    public static void main(String[] args) {
        JPanel panel = new JPanel(new OverlayLayout(null));
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        panel.add(button1);
        panel.addLayoutComponent(button1.getName(), button1);

        panel.add(button2);
        panel.addLayoutComponent(button2.getName(), button2);

        panel.setPreferredSize(new Dimension(200, 200));

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
