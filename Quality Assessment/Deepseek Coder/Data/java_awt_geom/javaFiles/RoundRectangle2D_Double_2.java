import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_Double_2 {
    public static void main(String[] args) {
        RoundRectangle2D.Double roundRectangle = new RoundRectangle2D.Double(10, 10, 50, 50, 10, 10);
        double width = roundRectangle.getWidth();
        System.out.println("Width: " + width);
    }
}
