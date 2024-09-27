import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_Float_3 {
    public static void main(String[] args) {
        RoundRectangle2D.Float rect = new RoundRectangle2D.Float();
        rect.setRoundRect(10.0f, 10.0f, 100.0f, 50.0f, 20.0f, 20.0f);
        System.out.println("X: " + rect.getX() + ", Y: " + rect.getY() + ", Width: " + rect.getWidth() + ", Height: " + rect.getHeight() + ", ArcWidth: " + rect.getArcWidth() + ", ArcHeight: " + rect.getArcHeight());
    }
}
