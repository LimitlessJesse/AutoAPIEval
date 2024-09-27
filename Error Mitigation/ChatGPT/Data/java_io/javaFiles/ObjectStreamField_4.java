import java.io.ObjectStreamField;

public class ObjectStreamField_4 {
    public static void main(String[] args) {
        ObjectStreamField field = new ObjectStreamField("fieldName", Object.class);
        System.out.println(field.toString());
    }
}
