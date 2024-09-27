import java.awt.font.TransformAttribute;

public class TransformAttribute_3 {
    public static void main(String[] args) {
        TransformAttribute transformAttribute1 = new TransformAttribute(null);
        TransformAttribute transformAttribute2 = new TransformAttribute(null);
        
        boolean result = transformAttribute1.equals(transformAttribute2);
        System.out.println("Are the transform attributes equal? " + result);
    }
}
