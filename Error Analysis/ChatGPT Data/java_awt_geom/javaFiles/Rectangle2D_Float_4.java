import java.awt.geom.Rectangle2D;

public class Rectangle2D_Float_4 {
    public static void main(String[] args) {
        Rectangle2D.Float rectangle = new Rectangle2D.Float();

        boolean empty = rectangle.isEmpty();
        System.out.println("Is Rectangle Empty: " + empty);
    }
}
