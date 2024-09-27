import java.awt.geom.Rectangle2D;

public class Rectangle2D_4 {
    public static void main(String[] args) {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 10, 10);
        Rectangle2D rect2 = new Rectangle2D.Double(5, 5, 10, 10);
        
        Rectangle2D intersection = rect1.createIntersection(rect2);
        
        System.out.println("Intersection: " + intersection);
    }
}
