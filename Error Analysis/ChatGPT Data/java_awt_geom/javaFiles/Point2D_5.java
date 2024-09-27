import java.awt.geom.Point2D;

public class Point2D_5 {
    public static void main(String[] args) {
        Point2D point = new Point2D.Double();
        point.setLocation(10.5, 20.0);
        System.out.println("Point location set to: (" + point.getX() + ", " + point.getY() + ")");
    }
}
