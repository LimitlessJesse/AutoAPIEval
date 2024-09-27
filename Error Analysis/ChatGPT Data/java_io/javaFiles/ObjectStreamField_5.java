import java.io.ObjectStreamField;

public class ObjectStreamField_5 {
    public static void main(String[] args) {
        ObjectStreamField field = new ObjectStreamField("exampleField", String.class);
        char typeCode = field.getTypeCode();
        System.out.println("Type Code: " + typeCode);
    }
}
