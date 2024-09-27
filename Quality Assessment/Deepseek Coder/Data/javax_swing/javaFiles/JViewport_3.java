import javax.swing.*;
import java.awt.*;

public class JViewport_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JViewport Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JViewport viewport = new JViewport();
        JScrollPane scrollPane = new JScrollPane(viewport);

        JLabel label = new JLabel("Hello, World!");
        viewport.add(label);

        // Set the view position
        viewport.setViewPosition(new Point(100, 100));

        frame.add(scrollPane);
        frame.pack();
        frame.setVisible(true);
    }
}
