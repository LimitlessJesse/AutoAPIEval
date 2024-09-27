import java.awt.geom.Rectangle2D;

public class Rectangle2D_Double_2 {
    public static void main(String[] args) {
        Rectangle2D.Double rectangle = new Rectangle2D.Double(10.0, 20.0, 30.0, 40.0);
        double yCoordinate = rectangle.getY();
        System.out.println("Y coordinate of the upper-left corner: " + yCoordinate);
    }
}
