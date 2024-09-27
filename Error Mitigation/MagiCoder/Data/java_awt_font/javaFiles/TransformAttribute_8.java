import java.awt.font.TextAttribute;
import java.awt.font.TransformAttribute;
import java.awt.geom.AffineTransform;

public class TransformAttribute_8 {
    public static void main(String[] args) {
        AffineTransform transform = new AffineTransform();
        TransformAttribute attribute = new TransformAttribute(transform);
        System.out.println(attribute.isIdentity());
    }
}
