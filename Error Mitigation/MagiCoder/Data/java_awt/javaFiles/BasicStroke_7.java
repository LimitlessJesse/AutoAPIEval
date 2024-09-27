import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.Stroke;

public class BasicStroke_7 {
    public static void main(String[] args) {
        // Create a BasicStroke object
        BasicStroke stroke = new BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, new float[]{10.0f, 5.0f}, 0.0f);

        // Get the dash array
        float[] dashArray = stroke.getDashArray();

        // Print the dash array
        for (float f : dashArray) {
            System.out.println(f);
        }
    }
}
