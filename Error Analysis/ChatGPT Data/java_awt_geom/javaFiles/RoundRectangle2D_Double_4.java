import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_Double_4 {
    public static void main(String[] args) {
        RoundRectangle2D.Double rectangle = new RoundRectangle2D.Double(10, 10, 100, 50, 20, 20);
        double y = rectangle.getY();
        System.out.println("Y coordinate of the rectangle: " + y);
    }
}
