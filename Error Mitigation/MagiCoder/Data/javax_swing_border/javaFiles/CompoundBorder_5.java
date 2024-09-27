import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class CompoundBorder_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Compound Border Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBorder(new CompoundBorder(
                new LineBorder(Color.BLACK),
                new EmptyBorder(10, 10, 10, 10)));

        JLabel label = new JLabel("Hello, World!");
        label.setBorder(new LineBorder(Color.RED));

        panel.add(label);
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}
