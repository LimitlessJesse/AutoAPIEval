import javax.swing.*;
import java.awt.*;

public class JScrollPane_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JScrollPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JTextArea textArea = new JTextArea(20, 20);
        textArea.setText("This is some text in a JTextArea. It is used as the view for a JScrollPane.");

        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
