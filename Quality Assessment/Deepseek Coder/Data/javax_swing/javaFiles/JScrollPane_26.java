import javax.swing.*;
import java.awt.*;

public class JScrollPane_26 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JScrollPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea(20, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setLayout(new FlowLayout()); // Set the layout manager

        frame.getContentPane().add(scrollPane);
        frame.pack();
        frame.setVisible(true);
    }
}
