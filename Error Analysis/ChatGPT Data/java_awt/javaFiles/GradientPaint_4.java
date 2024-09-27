import java.awt.GradientPaint;
import java.awt.geom.Point2D;

public class GradientPaint_4 {
    public static void main(String[] args) {
        Point2D point = new Point2D.Double(0, 0);
        GradientPaint gradientPaint = new GradientPaint(0, 0, java.awt.Color.RED, 10, 10, java.awt.Color.BLUE);
        
        Point2D startPoint = gradientPaint.getPoint1();
        Point2D endPoint = gradientPaint.getPoint2();
        
        System.out.println("Start Point: " + startPoint);
        System.out.println("End Point: " + endPoint);
    }
}
