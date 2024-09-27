import java.awt.RadialGradientPaint;
import java.awt.geom.Point2D;

public class RadialGradientPaint_5 {
    public static void main(String[] args) {
        Point2D centerPoint = new Point2D.Float(0.5f, 0.5f);
        float radius = 0.5f;
        float[] dist = {0.0f, 0.5f, 1.0f};
        Color[] colors = {Color.RED, Color.WHITE, Color.BLUE};
        RadialGradientPaint gradient = new RadialGradientPaint(centerPoint, radius, dist, colors);
        Point2D center = gradient.getCenterPoint();
        System.out.println("Center Point: " + center.getX() + ", " + center.getY());
    }
}
