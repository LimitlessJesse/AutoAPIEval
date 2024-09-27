import java.io.ObjectStreamField;

public class ObjectStreamField_1 {
    public static void main(String[] args) {
        ObjectStreamField field = new ObjectStreamField("fieldName", Object.class);
        System.out.println("Field name: " + field.getName());
    }
}
