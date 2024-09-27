import java.awt.geom.Point2D;

public class Point2D_1 {
    public static void main(String[] args) {
        Point2D point = new Point2D.Double(3.0, 4.0);
        double xCoordinate = point.getX();
        System.out.println("X coordinate: " + xCoordinate);
    }
}
