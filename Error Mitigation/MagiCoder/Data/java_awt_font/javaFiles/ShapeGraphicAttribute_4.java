import java.awt.font.ShapeGraphicAttribute;

public class ShapeGraphicAttribute_4 {
    public static void main(String[] args) {
        ShapeGraphicAttribute attr1 = new ShapeGraphicAttribute();
        ShapeGraphicAttribute attr2 = new ShapeGraphicAttribute();

        // Testing the equals method
        boolean isEqual = attr1.equals(attr2);
        System.out.println("Are attr1 and attr2 equal? " + isEqual);
    }
}
