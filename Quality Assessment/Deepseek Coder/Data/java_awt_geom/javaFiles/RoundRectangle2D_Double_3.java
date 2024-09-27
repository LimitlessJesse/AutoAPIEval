import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_Double_3 {
    public static void main(String[] args) {
        RoundRectangle2D.Double roundRectangle = new RoundRectangle2D.Double(10, 10, 50, 50, 10, 10);
        double x = roundRectangle.getX();
        System.out.println("The x-coordinate of the upper-left corner of the round rectangle is: " + x);
    }
}
