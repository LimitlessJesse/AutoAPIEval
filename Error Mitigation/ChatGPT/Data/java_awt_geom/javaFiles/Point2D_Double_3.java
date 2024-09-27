import java.awt.geom.Point2D;

public class Point2D_Double_3 {
    public static void main(String[] args) {
        Point2D.Double point = new Point2D.Double();
        System.out.println("Initial Point: " + point);

        point.setLocation(10.5, 20.7);
        System.out.println("Updated Point: " + point);
    }
}
