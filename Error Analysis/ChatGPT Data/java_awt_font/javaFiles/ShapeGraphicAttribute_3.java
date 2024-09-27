import java.awt.font.ShapeGraphicAttribute;
import java.awt.font.TextAttribute;

public class ShapeGraphicAttribute_3 {
    public static void main(String[] args) {
        ShapeGraphicAttribute shapeAttr1 = new ShapeGraphicAttribute(null, TextAttribute.UNDERLINE_ON);
        ShapeGraphicAttribute shapeAttr2 = new ShapeGraphicAttribute(null, TextAttribute.UNDERLINE_ON);

        boolean areEqual = shapeAttr1.equals(shapeAttr2);
        System.out.println("Are the ShapeGraphicAttributes equal? " + areEqual);
    }
}
