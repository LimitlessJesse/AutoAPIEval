import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_Float_3 {
    public static void main(String[] args) {
        RoundRectangle2D.Float roundRect = new RoundRectangle2D.Float();
        roundRect.setRoundRect(10.0, 10.0, 100.0, 50.0, 20.0, 20.0);
        System.out.println("Round rectangle properties: ");
        System.out.println("X coordinate: " + roundRect.getX());
        System.out.println("Y coordinate: " + roundRect.getY());
        System.out.println("Width: " + roundRect.getWidth());
        System.out.println("Height: " + roundRect.getHeight());
        System.out.println("Arc width: " + roundRect.getArcWidth());
        System.out.println("Arc height: " + roundRect.getArcHeight());
    }
}
