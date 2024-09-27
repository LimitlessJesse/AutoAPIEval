import java.awt.geom.Point2D;

public class Point2D_4 {
    public static void main(String[] args) {
        Point2D p1 = new Point2D.Double(1.0, 2.0);
        Point2D p2 = new Point2D.Double(3.0, 4.0);

        p1.setLocation(p2);

        System.out.println("p1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("p2: (" + p2.getX() + ", " + p2.getY() + ")");
    }
}
