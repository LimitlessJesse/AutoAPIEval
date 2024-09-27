import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Stroke;

public class BasicStroke_4 {
    public static void main(String[] args) {
        // Create a BasicStroke object
        BasicStroke stroke = new BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, new float[]{10.0f}, 0);

        // Get the end cap style
        int endCap = stroke.getEndCap();

        // Print the end cap style
        System.out.println("End cap style: " + endCap);
    }
}
