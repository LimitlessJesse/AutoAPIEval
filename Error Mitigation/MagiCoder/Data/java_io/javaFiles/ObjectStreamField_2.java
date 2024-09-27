import java.io.ObjectStreamField;

public class ObjectStreamField_2 {
    public static void main(String[] args) {
        ObjectStreamField field = new ObjectStreamField("name", String.class);
        String fieldName = field.getName();
        System.out.println("Field name: " + fieldName);
    }
}
