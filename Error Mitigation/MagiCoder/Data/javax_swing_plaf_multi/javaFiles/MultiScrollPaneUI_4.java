import javax.swing.*;
import javax.swing.plaf.multi.MultiScrollPaneUI;
import java.awt.*;

public class MultiScrollPaneUI_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setPreferredSize(new Dimension(200, 200));

        JTextArea textArea = new JTextArea();
        textArea.setText("Hello, this is a test text.");
        scrollPane.setViewportView(textArea);

        MultiScrollPaneUI multiScrollPaneUI = new MultiScrollPaneUI();
        multiScrollPaneUI.paint(scrollPane.getGraphics(), scrollPane);

        frame.getContentPane().add(scrollPane);
        frame.setVisible(true);
    }
}
