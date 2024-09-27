import java.awt.geom.AffineTransform;

public class AffineTransform_7 {
    public static void main(String[] args) {
        AffineTransform at = new AffineTransform();
        at.setToShear(1.0, 2.0);
        System.out.println(at);
    }
}
