import java.awt.*;
import java.awt.geom.*;

public class RadialGradientPaint_9 {
    public static void main(String[] args) {
        // Define the center point and radius of the radial gradient
        Point2D center = new Point2D.Double(100, 100);
        double radius = 50;

        // Define the color at the center and at the edge of the gradient
        Color color1 = Color.RED;
        Color color2 = Color.BLUE;

        // Create the radial gradient paint
        RadialGradientPaint gradientPaint = new RadialGradientPaint(center, (float)radius, color1, color2);

        // Create a graphics context
        Graphics2D g2d = (Graphics2D) System.out.createGraphics();

        // Create a context for the gradient paint
        PaintContext context = gradientPaint.createContext(null, null, null, null, null);

        // Apply the gradient paint to the graphics context
        context.dispose();
    }
}
