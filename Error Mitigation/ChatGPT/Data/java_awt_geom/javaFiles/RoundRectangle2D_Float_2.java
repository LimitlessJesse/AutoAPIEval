import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_Float_2 {
    public static void main(String[] args) {
        RoundRectangle2D.Float roundRect = new RoundRectangle2D.Float(10.0f, 10.0f, 100.0f, 50.0f, 20.0f, 20.0f);
        double arcHeight = roundRect.getArcHeight();
        System.out.println("Arc Height: " + arcHeight);
    }
}
