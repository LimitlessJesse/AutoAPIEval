import java.awt.geom.Point2D;

public class Point2D_Double_3 {
    public static void main(String[] args) {
        Point2D.Double point = new Point2D.Double();
        point.setLocation(3.5, 7.2);
        System.out.println("Point Location: (" + point.getX() + ", " + point.getY() + ")");
    }
}
