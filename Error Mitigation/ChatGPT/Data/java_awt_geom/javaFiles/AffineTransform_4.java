import java.awt.geom.AffineTransform;

public class AffineTransform_4 {
    public static void main(String[] args) {
        AffineTransform transform = new AffineTransform();
        transform.shear(0.5, 0.3);
        System.out.println("Transform after shearing: " + transform);
    }
}
