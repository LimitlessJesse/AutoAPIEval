import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import java.awt.Point;

public class JViewport_4 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JTextArea textArea = new JTextArea(20, 40);
                JScrollPane scrollPane = new JScrollPane(textArea);
                JFrame frame = new JFrame("JViewport Example");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(scrollPane);
                frame.pack();
                frame.setVisible(true);

                Point viewPosition = scrollPane.getViewport().getViewPosition();
                System.out.println("View Position: " + viewPosition);
            }
        });
    }
}
