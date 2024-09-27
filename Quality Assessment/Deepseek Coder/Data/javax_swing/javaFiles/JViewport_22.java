import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Rectangle;

public class JViewport_22 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JViewport Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea(20, 40);
        textArea.setText("This is an example of JViewport and JScrollPane");

        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.getContentPane().add(scrollPane);

        frame.setSize(400, 300);
        frame.setVisible(true);

        Rectangle viewRect = scrollPane.getViewport().getViewRect();
        System.out.println("View Rectangle: " + viewRect);
    }
}
