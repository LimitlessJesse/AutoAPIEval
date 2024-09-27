import javax.swing.*;
import java.awt.*;

public class JViewport_7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JViewport viewport = new JViewport();
        viewport.setPreferredSize(new Dimension(200, 200));

        JScrollPane scrollPane = new JScrollPane(viewport);
        frame.add(scrollPane);

        JLabel label = new JLabel("Hello, World!");
        viewport.add(label);

        viewport.scrollRectToVisible(label.getBounds());

        frame.setVisible(true);
    }
}
