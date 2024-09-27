import java.awt.geom.AffineTransform;

public class AffineTransform_1 {
    public static void main(String[] args) {
        AffineTransform at = AffineTransform.getTranslateInstance(10, 10);
        System.out.println("Original AffineTransform: " + at);
        
        at.translate(5, 5);
        System.out.println("Translated AffineTransform: " + at);
    }
}
