import java.awt.geom.AffineTransform;

public class AffineTransform_4 {
    public static void main(String[] args) {
        AffineTransform transform = new AffineTransform();
        double tx = 10.0;
        double ty = 20.0;
        
        transform.translate(tx, ty);
        
        System.out.println("Transform after translation: " + transform);
    }
}
