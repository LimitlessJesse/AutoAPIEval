import java.awt.geom.AffineTransform;

public class AffineTransform_5 {
    public static void main(String[] args) {
        AffineTransform transform1 = new AffineTransform();
        AffineTransform transform2 = new AffineTransform();
        
        // Applying some transformations to transform1
        transform1.scale(2, 2);
        transform1.rotate(Math.toRadians(45));
        transform1.translate(10, 10);
        
        // Concatenating transform2 with transform1
        transform1.concatenate(transform2);
        
        // Output the concatenated transformation
        System.out.println("Concatenated Transform: " + transform1);
    }
}
