import java.awt.geom.AffineTransform;

public class AffineTransform_3 {
    public static void main(String[] args) {
        AffineTransform transform = new AffineTransform();
        transform.shear(0.5, 0.1); // Shear by 0.5 in x-axis and 0.1 in y-axis
        System.out.println("Transform matrix after shearing: " + transform);
    }
}
