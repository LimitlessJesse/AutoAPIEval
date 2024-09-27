import java.awt.geom.Ellipse2D;

public class Ellipse2D_5 {
    public static void main(String[] args) {
        Ellipse2D ellipse = new Ellipse2D.Double(10, 10, 100, 50);
        boolean intersects = ellipse.intersects(20, 20, 10, 10);
        System.out.println(intersects);
    }
}
