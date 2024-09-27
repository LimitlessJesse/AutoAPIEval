import java.awt.GradientPaint;
import java.awt.geom.Point2D;

public class GradientPaint_3 {
    public static void main(String[] args) {
        Point2D point = new Point2D.Double(10, 20);
        GradientPaint gradientPaint = new GradientPaint(0, 0, java.awt.Color.RED, 50, 50, java.awt.Color.BLUE);
        Point2D point1 = gradientPaint.getPoint1();
        System.out.println("Point 1: " + point1.getX() + ", " + point1.getY());
    }
}
