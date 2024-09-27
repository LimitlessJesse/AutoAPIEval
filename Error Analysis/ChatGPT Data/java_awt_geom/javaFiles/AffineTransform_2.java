import java.awt.geom.AffineTransform;

public class AffineTransform_2 {
    public static void main(String[] args) {
        AffineTransform transform = new AffineTransform();
        transform.scale(2.0, 1.5);
        System.out.println("Transformed: " + transform);
    }
}
