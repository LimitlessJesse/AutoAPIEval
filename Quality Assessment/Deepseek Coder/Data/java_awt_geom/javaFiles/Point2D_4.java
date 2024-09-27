import java.awt.geom.Point2D;

public class Point2D_4 {
    public static void main(String[] args) {
        Point2D point = new Point2D.Float();
        point.setLocation(5.0, 10.0);
        System.out.println("X: " + point.getX() + ", Y: " + point.getY());
    }
}
