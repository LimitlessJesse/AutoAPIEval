import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_Float_1 {
    public static void main(String[] args) {
        RoundRectangle2D.Float roundRect = new RoundRectangle2D.Float(10.0f, 10.0f, 100.0f, 50.0f, 20.0f, 20.0f);
        double arcWidth = roundRect.getArcWidth();
        System.out.println("Arc Width: " + arcWidth);
    }
}
