import java.awt.geom.AffineTransform;

public class AffineTransform_1 {
    public static void main(String[] args) {
        AffineTransform transform = new AffineTransform();
        double theta = Math.PI / 2; // Rotate by 90 degrees
        transform.rotate(theta);
        
        System.out.println(transform);
    }
}
