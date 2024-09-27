import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_Float_1 {
    public static void main(String[] args) {
        RoundRectangle2D.Float roundRect = new RoundRectangle2D.Float();
        roundRect.setRoundRect(10, 10, 50, 50, 10, 10);
        System.out.println("X: " + roundRect.x);
        System.out.println("Y: " + roundRect.y);
        System.out.println("Width: " + roundRect.width);
        System.out.println("Height: " + roundRect.height);
        System.out.println("Arc Width: " + roundRect.arcWidth);
        System.out.println("Arc Height: " + roundRect.arcHeight);
    }
}
