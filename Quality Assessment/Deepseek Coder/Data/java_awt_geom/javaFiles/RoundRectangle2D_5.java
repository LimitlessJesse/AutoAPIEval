import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_5 {
    public static void main(String[] args) {
        // Create a new RoundRectangle2D object
        RoundRectangle2D rr = new RoundRectangle2D.Double(10, 10, 50, 50, 10, 10);

        // Check if the rectangle contains the point (20, 20)
        boolean contains = rr.contains(20, 20);

        // Print the result
        System.out.println("Does the rectangle contain the point (20, 20)? " + contains);
    }
}
