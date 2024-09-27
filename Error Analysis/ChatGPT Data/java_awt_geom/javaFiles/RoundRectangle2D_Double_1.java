import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_Double_1 {
    public static void main(String[] args) {
        RoundRectangle2D roundRect = new RoundRectangle2D.Double(10, 10, 100, 50, 20, 20);
        double arcWidth = ((RoundRectangle2D.Double)roundRect).getArcWidth();
        System.out.println("Arc Width: " + arcWidth);
    }
}
