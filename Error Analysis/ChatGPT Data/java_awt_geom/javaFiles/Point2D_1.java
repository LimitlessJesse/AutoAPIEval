import java.awt.geom.Point2D;

public class Point2D_1 {
    public static void main(String[] args) {
        Point2D point1 = new Point2D.Double(3.0, 4.0);
        Point2D point2 = new Point2D.Double(6.0, 8.0);
        
        double distance = distance(point1, point2);
        
        System.out.println("Distance between point1 and point2: " + distance);
    }
    
    public static double distance(Point2D point1, Point2D point2) {
        return point1.distance(point2);
    }
}
