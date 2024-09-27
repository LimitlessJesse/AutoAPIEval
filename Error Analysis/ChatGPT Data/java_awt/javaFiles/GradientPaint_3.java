import java.awt.GradientPaint;
import java.awt.geom.Point2D;

public class GradientPaint_3 {
    public static void main(String[] args) {
        GradientPaint gradientPaint = new GradientPaint(0, 0, Color.RED, 10, 10, Color.BLUE);
        Point2D point = gradientPaint.getPoint1();
        System.out.println("Point 1: x=" + point.getX() + ", y=" + point.getY());
    }
}
