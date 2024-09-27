import java.awt.geom.Rectangle2D;

public class Rectangle2D_5 {
    public static void main(String[] args) {
        Rectangle2D rectangle1 = new Rectangle2D.Double(0, 0, 5, 5);
        Rectangle2D rectangle2 = new Rectangle2D.Double(3, 3, 5, 5);
        
        Rectangle2D intersection = rectangle1.createIntersection(rectangle2);
        
        System.out.println("Intersection Area: " + intersection.getWidth() * intersection.getHeight());
    }
}
