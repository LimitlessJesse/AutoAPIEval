import java.awt.geom.Ellipse2D;

public class Ellipse2D_5 {
    public static void main(String[] args) {
        Ellipse2D ellipse1 = new Ellipse2D.Double(0, 0, 50, 50);
        Ellipse2D ellipse2 = new Ellipse2D.Double(25, 25, 50, 50);
        
        boolean intersects = ellipse1.intersects(ellipse2.getX(), ellipse2.getY(), ellipse2.getWidth(), ellipse2.getHeight());
        
        System.out.println("Ellipses intersect: " + intersects);
    }
}
