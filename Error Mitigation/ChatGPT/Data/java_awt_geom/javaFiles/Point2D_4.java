import java.awt.geom.Point2D;

public class Point2D_4 {
    public static void main(String[] args) {
        Point2D point1 = new Point2D.Double(3, 4);
        Point2D point2 = new Point2D.Double(6, 8);
        
        double distance = point1.distance(point2.getX(), point2.getY());
        
        System.out.println("Distance between point1 and point2: " + distance);
    }
}
