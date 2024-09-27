import javax.swing.*;
import java.awt.*;

public class JViewport_6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setPreferredSize(new Dimension(200, 200));
        frame.add(scrollPane);

        JViewport viewport = scrollPane.getViewport();
        Dimension viewSize = viewport.getViewSize();

        System.out.println("View size: " + viewSize);

        frame.setVisible(true);
    }
}
