import java.awt.LinearGradientPaint;
import java.awt.geom.Point2D;

public class LinearGradientPaint_3 {
    public static void main(String[] args) {
        Point2D startPoint = new Point2D.Double(0, 0);
        Point2D endPoint = new Point2D.Double(100, 100);
        float[] fractions = {0.0f, 1.0f};
        Color[] colors = {Color.RED, Color.BLUE};
        
        LinearGradientPaint linearGradient = new LinearGradientPaint(startPoint, endPoint, fractions, colors);
        
        Point2D startPointCopy = linearGradient.getStartPoint();
        System.out.println("Start Point: " + startPointCopy);
    }
}
