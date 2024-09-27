import java.awt.geom.AffineTransform;

public class AffineTransform_6 {
    public static void main(String[] args) {
        AffineTransform at = new AffineTransform();
        at.setToRotation(Math.PI / 2); // Rotate 90 degrees
        System.out.println(at);
    }
}
