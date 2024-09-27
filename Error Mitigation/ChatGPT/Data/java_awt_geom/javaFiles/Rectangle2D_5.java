import java.awt.geom.Rectangle2D;

public class Rectangle2D_5 {
    public static void main(String[] args) {
        Rectangle2D rectangle = new Rectangle2D.Double(0, 0, 10, 10);
        double x = 5;
        double y = 5;
        
        boolean isInside = rectangle.contains(x, y);
        System.out.println("Is point (" + x + ", " + y + ") inside the rectangle? " + isInside);
    }
}
