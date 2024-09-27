import java.awt.RadialGradientPaint;
import java.awt.geom.Point2D;

public class RadialGradientPaint_5 {
    public static void main(String[] args) {
        Point2D centerPoint = new RadialGradientPaint(0, 0, 10, new float[]{0, 1}, new Color[]{Color.RED, Color.BLUE}).getCenterPoint();
        System.out.println("Center Point: " + centerPoint);
    }
}
