import java.awt.Point;
import java.awt.GradientPaint;

public class GradientPaint_3 {
    public static void main(String[] args) {
        GradientPaint gradientPaint = new GradientPaint(0, 0, null, 100, 100, null);
        Point point1 = gradientPaint.getPoint1();
        System.out.println("Point1: " + point1);
    }
}
