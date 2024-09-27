import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_1 {
    public static void main(String[] args) {
        RoundRectangle2D roundRect = new RoundRectangle2D.Double(10, 10, 50, 30, 5, 5);
        
        double arcWidth = roundRect.getArcWidth();
        System.out.println("Arc Width: " + arcWidth);
    }
}
