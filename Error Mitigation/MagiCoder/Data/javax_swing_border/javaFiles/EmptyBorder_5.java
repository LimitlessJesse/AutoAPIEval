import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class EmptyBorder_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Empty Border Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(10, 20, 30, 40));

        JButton button = new JButton("Click me");
        button.setPreferredSize(new Dimension(100, 50));
        panel.add(button);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
