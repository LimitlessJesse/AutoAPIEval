import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_Double_2 {
    public static void main(String[] args) {
        RoundRectangle2D.Double roundRect = new RoundRectangle2D.Double(10.0, 10.0, 100.0, 50.0, 20.0, 20.0);
        double arcHeight = roundRect.getArcHeight();
        System.out.println("Arc Height: " + arcHeight);
    }
}
