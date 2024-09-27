import java.awt.geom.Point2D;

public class Point2D_Float_2 {
    public static void main(String[] args) {
        Point2D.Float point = new Point2D.Float();
        point.setLocation(10.5, 20.7);
        System.out.println("Point location: " + point.getX() + ", " + point.getY());
    }
}
