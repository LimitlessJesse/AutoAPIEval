import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_5 {
    public static void main(String[] args) {
        RoundRectangle2D roundRect = new RoundRectangle2D.Double(10, 10, 100, 50, 20, 20);
        double x = 30;
        double y = 20;
        
        boolean isInside = roundRect.contains(x, y);
        System.out.println("Is point (" + x + ", " + y + ") inside the RoundRectangle? " + isInside);
    }
}
