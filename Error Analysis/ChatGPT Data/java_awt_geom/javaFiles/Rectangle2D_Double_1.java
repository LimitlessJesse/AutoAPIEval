import java.awt.geom.Rectangle2D;

public class Rectangle2D_Double_1 {
    public static void main(String[] args) {
        Rectangle2D.Double rect = new Rectangle2D.Double(5, 10, 20, 30);
        double width = rect.getWidth();
        System.out.println("Width: " + width);
    }
}
