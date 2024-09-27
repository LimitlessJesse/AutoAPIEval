import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_Double_3 {
    public static void main(String[] args) {
        RoundRectangle2D.Double rectangle = new RoundRectangle2D.Double(10, 10, 100, 50, 20, 20);
        double x = rectangle.getX();
        System.out.println("X coordinate of the rectangle: " + x);
    }
}
