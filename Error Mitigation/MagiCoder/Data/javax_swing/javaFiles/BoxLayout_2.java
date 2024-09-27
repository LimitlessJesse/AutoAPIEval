import java.awt.*;
import javax.swing.*;

public class BoxLayout_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        panel.add(button1);
        panel.add(button2);

        panel.addLayoutComponent("Button 3", new JButton("Button 3"));

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
