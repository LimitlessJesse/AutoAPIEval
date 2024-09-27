import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_Double_1 {
    public static void main(String[] args) {
        RoundRectangle2D.Double roundRect = new RoundRectangle2D.Double(10.0, 10.0, 100.0, 50.0, 20.0, 20.0);
        double arcWidth = roundRect.getArcWidth();
        System.out.println("Arc Width: " + arcWidth);
    }
}
