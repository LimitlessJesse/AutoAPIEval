import javax.swing.SwingUtilities;
import java.awt.Point;
import java.awt.Component;

public class SwingUtilities_4 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Component component = new Component() {}; // create a dummy component
                Point screenPoint = new Point(100, 200); // point on screen
                Point convertedPoint = new Point();
                SwingUtilities.convertPointFromScreen(screenPoint, component, convertedPoint);
                System.out.println("Converted point: " + convertedPoint);
            }
        });
    }
}
