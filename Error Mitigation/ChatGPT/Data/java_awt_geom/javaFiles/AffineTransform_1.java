import java.awt.geom.AffineTransform;

public class AffineTransform_1 {
    public static void main(String[] args) {
        AffineTransform transform = new AffineTransform();
        transform.translate(10.0, 20.0);
        System.out.println("Transformed coordinates: " + transform);
    }
}
