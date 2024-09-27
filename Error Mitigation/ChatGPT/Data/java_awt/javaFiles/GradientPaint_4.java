import java.awt.GradientPaint;
import java.awt.geom.Point2D;

public class GradientPaint_4 {
    public static void main(String[] args) {
        Point2D point2 = new Point2D.Double(10, 20);
        GradientPaint gradientPaint = new GradientPaint(0, 0, Color.RED, point2, Color.BLUE);
        Point2D anchorPoint = gradientPaint.getPoint2();
        System.out.println("Point2 anchor: " + anchorPoint);
    }
}
