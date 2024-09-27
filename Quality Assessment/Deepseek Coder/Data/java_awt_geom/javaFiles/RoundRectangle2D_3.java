import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_3 {
    public static void main(String[] args) {
        // Create two RoundRectangle2D objects
        RoundRectangle2D rect1 = new RoundRectangle2D.Double(10, 10, 50, 50, 10, 10);
        RoundRectangle2D rect2 = new RoundRectangle2D.Double(25, 25, 50, 50, 10, 10);

        // Check if rect1 intersects with rect2
        boolean intersects = rect1.intersects(rect2.getX(), rect2.getY(), rect2.getWidth(), rect2.getHeight());

        // Print the result
        System.out.println("Do the two rectangles intersect? " + intersects);
    }
}
