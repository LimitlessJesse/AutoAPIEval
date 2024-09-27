import java.awt.geom.Rectangle2D;

public class Rectangle2D_Double_1 {
    public static void main(String[] args) {
        Rectangle2D.Double rect = new Rectangle2D.Double(10.0, 20.0, 30.0, 40.0);
        double x = rect.getX();
        System.out.println("X coordinate of the upper-left corner of the rectangle: " + x);
    }
}
