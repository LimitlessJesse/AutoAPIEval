import java.awt.*;
import java.awt.geom.*;

public class LinearGradientPaint_9 {
    public static void main(String[] args) {
        // Define the start and end points of the gradient
        Point startPoint = new Point(0, 0);
        Point endPoint = new Point(100, 100);

        // Define the colors for the gradient
        Color startColor = Color.RED;
        Color endColor = Color.BLUE;

        // Create a LinearGradientPaint object
        LinearGradientPaint gradientPaint = new LinearGradientPaint(startPoint, endPoint, startColor, endColor);

        // Create a PaintContext using the gradientPaint
        PaintContext context = gradientPaint.createContext(null, null, null, null, null);

        // Get the color data from the context
        float[] data = context.getData();

        // Print the color data
        for (float color : data) {
            System.out.println(color);
        }
    }
}
