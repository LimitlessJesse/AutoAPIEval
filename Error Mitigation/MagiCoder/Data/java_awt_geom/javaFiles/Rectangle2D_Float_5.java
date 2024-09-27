import java.awt.geom.Rectangle2D;

public class Rectangle2D_Float_5 {
    public static void main(String[] args) {
        Rectangle2D.Float rect = new Rectangle2D.Float();
        rect.setRect(10.0f, 20.0f, 30.0f, 40.0f);
        System.out.println("X: " + rect.x + ", Y: " + rect.y + ", Width: " + rect.width + ", Height: " + rect.height);
    }
}
