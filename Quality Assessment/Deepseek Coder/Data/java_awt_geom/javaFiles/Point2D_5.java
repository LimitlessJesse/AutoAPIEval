import java.awt.geom.Point2D;

public class Point2D_5 {
    public static void main(String[] args) {
        Point2D point1 = new Point2D.Double(2.0, 3.0);
        Point2D point2 = new Point2D.Double(5.0, 7.0);

        double distance = point1.distance(point2);

        System.out.println("The distance between the two points is: " + distance);
    }
}
