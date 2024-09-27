import java.awt.LinearGradientPaint;
import java.awt.geom.Point2D;

public class LinearGradientPaint_4 {
    public static void main(String[] args) {
        Point2D endPoint = new Point2D.Double(100, 100);
        LinearGradientPaint linearGradientPaint = new LinearGradientPaint(0, 0, 200, 200, new float[]{0, 1}, new Color[]{Color.RED, Color.BLUE});
        Point2D copyOfEndPoint = linearGradientPaint.getEndPoint();
        System.out.println("End Point: " + copyOfEndPoint);
    }
}
