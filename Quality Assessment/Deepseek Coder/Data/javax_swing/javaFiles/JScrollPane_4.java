import javax.swing.*;
import java.awt.*;

public class JScrollPane_4 {
    public static void main(String[] args) {
        JScrollPane scrollPane = new JScrollPane();
        JButton button = new JButton("Click me");
        scrollPane.setViewportView(button);
        scrollPane.setCorner(JScrollPane.UPPER_RIGHT_CORNER, button);

        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(scrollPane);
        frame.setVisible(true);
    }
}
