import java.awt.geom.Point2D;

public class Point2D_Double_3 {
    public static void main(String[] args) {
        Point2D.Double point = new Point2D.Double();
        point.setLocation(5.0, 10.0);
        System.out.println("X: " + point.x + ", Y: " + point.y);
    }
}
