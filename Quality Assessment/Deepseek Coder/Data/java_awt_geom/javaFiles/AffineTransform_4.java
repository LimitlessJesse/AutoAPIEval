import java.awt.geom.AffineTransform;

public class AffineTransform_4 {
    public static void main(String[] args) {
        AffineTransform at = AffineTransform.getRotateInstance(1.0, 2.0, 3.0);
        at.shear(0.5, 0.5);
        System.out.println(at);
    }
}
