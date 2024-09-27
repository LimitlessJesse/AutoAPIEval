import javax.swing.*;
import java.awt.*;

public class BoxLayout_7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BoxLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        BoxLayout layout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(layout);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        layout.addLayoutComponent("Button 1", button1);
        layout.addLayoutComponent("Button 2", button2);
        layout.addLayoutComponent("Button 3", button3);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
