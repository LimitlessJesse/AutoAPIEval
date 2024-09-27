import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_Double_4 {
    public static void main(String[] args) {
        RoundRectangle2D.Double roundRectangle = new RoundRectangle2D.Double(10, 20, 30, 40, 5, 6);
        double y = roundRectangle.getY();
        System.out.println("The y-coordinate of the RoundRectangle2D is: " + y);
    }
}
