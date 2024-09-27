import javax.swing.*;
import java.awt.*;

public class JViewport_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JViewport viewport = new JViewport();
        viewport.setBackground(Color.LIGHT_GRAY);

        JScrollPane scrollPane = new JScrollPane(viewport);
        frame.add(scrollPane);

        JTextArea textArea = new JTextArea(20, 40);
        textArea.setBackground(Color.WHITE);

        viewport.setView(textArea);
        viewport.setViewSize(new Dimension(200, 200));

        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
