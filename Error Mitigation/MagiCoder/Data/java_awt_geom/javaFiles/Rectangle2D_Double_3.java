import java.awt.geom.Rectangle2D;

public class Rectangle2D_Double_3 {
    public static void main(String[] args) {
        Rectangle2D.Double rect = new Rectangle2D.Double(10, 20, 30, 40);
        double width = rect.getWidth();
        System.out.println("Width: " + width);
    }
}
