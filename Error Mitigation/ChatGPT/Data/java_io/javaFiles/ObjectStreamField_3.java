import java.io.ObjectStreamField;

public class ObjectStreamField_3 {
    public static void main(String[] args) {
        ObjectStreamField field = new ObjectStreamField("fieldName", Object.class);
        char typeCode = field.getTypeCode();
        System.out.println("Type Code: " + typeCode);
    }
}
