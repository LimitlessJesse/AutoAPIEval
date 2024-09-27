import java.awt.geom.AffineTransform;

public class AffineTransform_3 {
    public static void main(String[] args) {
        AffineTransform transform = new AffineTransform();
        transform.scale(2.0, 1.5);
        System.out.println("Transformed scale: " + transform);
    }
}
