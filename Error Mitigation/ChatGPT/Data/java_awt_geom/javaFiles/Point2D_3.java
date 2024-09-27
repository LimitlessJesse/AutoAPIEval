import java.awt.geom.Point2D;

public class Point2D_3 {
    public static void main(String[] args) {
        Point2D point = new Point2D.Double();
        System.out.println("Initial Point: " + point.getX() + ", " + point.getY());
        
        point.setLocation(10.5, 20.7);
        System.out.println("Updated Point: " + point.getX() + ", " + point.getY());
    }
}
