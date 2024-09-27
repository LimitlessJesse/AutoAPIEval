import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_Double_6 {
    public static void main(String[] args) {
        RoundRectangle2D.Double rect = new RoundRectangle2D.Double(10, 10, 50, 50, 10, 10);
        double x = rect.getX();
        System.out.println("X coordinate of the upper-left corner of the framing rectangle: " + x);
    }
}
