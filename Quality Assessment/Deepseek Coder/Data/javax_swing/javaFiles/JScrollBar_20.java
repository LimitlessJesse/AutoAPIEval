import javax.swing.JScrollBar;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class JScrollBar_20 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JScrollBar scrollBar = new JScrollBar();
        JScrollPane scrollPane = new JScrollPane(scrollBar);

        // Set the orientation of the scroll bar
        scrollBar.setOrientation(JScrollBar.HORIZONTAL);

        frame.add(scrollPane);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
