import javax.swing.SwingUtilities;
import java.awt.Point;
import java.awt.Component;
import javax.swing.JFrame;

public class SwingUtilities_3 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Test");
                frame.setSize(300, 200);
                frame.setVisible(true);

                Point point = new Point(100, 100);
                Component component = frame;

                Point screenPoint = SwingUtilities.convertPointToScreen(point, component);
                System.out.println("Screen Point: " + screenPoint);
            }
        });
    }
}
