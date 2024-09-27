import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Point;
import java.awt.geom.Point2D;

public class GradientPaint_2 {
    public static void main(String[] args) {
        // Create a GradientPaint object
        GradientPaint gradientPaint = new GradientPaint(0, 0, Color.RED, 100, 100, Color.BLUE);
        
        // Get the second point of the gradient paint
        Point2D point2D = gradientPaint.getPoint2();
        
        // Print the x and y coordinates of the point
        System.out.println("X: " + point2D.getX() + ", Y: " + point2D.getY());
    }
}
