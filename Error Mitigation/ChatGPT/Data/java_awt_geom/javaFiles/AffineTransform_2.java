import java.awt.geom.AffineTransform;

public class AffineTransform_2 {
    public static void main(String[] args) {
        AffineTransform transform = new AffineTransform();
        transform.rotate(Math.toRadians(45)); // Rotates by 45 degrees
        double[] point = {10, 10}; // Point to be transformed
        transform.transform(point, 0, point, 0, 1); // Applying the transformation
        System.out.println("Transformed point: (" + point[0] + ", " + point[1] + ")");
    }
}
