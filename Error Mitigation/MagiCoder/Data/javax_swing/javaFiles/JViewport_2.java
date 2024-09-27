import javax.swing.JFrame;
import javax.swing.JViewport;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JViewport_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JTextArea textArea = new JTextArea(20, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);
        JViewport viewport = scrollPane.getViewport();

        // Get the view
        System.out.println(viewport.getView());
    }
}
