import java.io.ObjectStreamField;

public class ObjectStreamField_2 {
    public static void main(String[] args) {
        ObjectStreamField field = new ObjectStreamField("fieldName", Object.class);
        Class<?> fieldType = field.getType();
        System.out.println("Field type: " + fieldType.getName());
    }
}
