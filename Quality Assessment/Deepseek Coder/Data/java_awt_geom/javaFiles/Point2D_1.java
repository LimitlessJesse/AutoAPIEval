import java.awt.geom.Point2D;

public class Point2D_1 {
    public static void main(String[] args) {
        Point2D point = new Point2D.Double(5, 10);
        double x = point.getX();
        System.out.println("The x-coordinate is: " + x);
    }
}
