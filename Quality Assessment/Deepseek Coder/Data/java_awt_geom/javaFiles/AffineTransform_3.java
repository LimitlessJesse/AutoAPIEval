import java.awt.geom.AffineTransform;

public class AffineTransform_3 {
    public static void main(String[] args) {
        AffineTransform at = AffineTransform.getRotateInstance(Math.PI / 2);
        at.rotate(Math.PI / 2);
        System.out.println(at);
    }
}
