import java.awt.font.ShapeGraphicAttribute;

public class ShapeGraphicAttribute_4 {
    public static void main(String[] args) {
        ShapeGraphicAttribute attribute = new ShapeGraphicAttribute(null, ShapeGraphicAttribute.TOP_ALIGNMENT, false);
        int hashCode = attribute.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
