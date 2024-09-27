import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import java.awt.Dimension;

public class JViewport_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JScrollPane scrollPane = new JScrollPane();
        JViewport viewport = scrollPane.getViewport();

        // Set the size of the view
        viewport.setViewSize(new Dimension(200, 200));

        frame.add(scrollPane);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
