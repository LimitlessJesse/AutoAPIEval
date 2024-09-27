import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class JScrollPane_9 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JTextArea textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(200, 200));

        Border border = new LineBorder(Color.BLACK, 2);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setViewportBorder(border);

        frame.add(scrollPane);
        frame.setVisible(true);
    }
}
