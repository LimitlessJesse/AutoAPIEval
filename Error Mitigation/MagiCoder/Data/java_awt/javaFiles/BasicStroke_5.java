import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Stroke;

public class BasicStroke_5 {
    public static void main(String[] args) {
        // Create a BasicStroke object
        BasicStroke stroke = new BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, new float[]{10.0f}, 0);

        // Get the line join style
        int lineJoin = stroke.getLineJoin();

        // Print the line join style
        System.out.println("Line join style: " + lineJoin);
    }
}
