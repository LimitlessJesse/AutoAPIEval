import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_Float_8 {
    public static void main(String[] args) {
        RoundRectangle2D.Float rect = new RoundRectangle2D.Float(10, 10, 100, 100, 10, 10);
        System.out.println(rect.getBounds2D());
    }
}
