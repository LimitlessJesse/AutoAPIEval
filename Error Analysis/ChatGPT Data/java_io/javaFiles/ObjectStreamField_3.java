import java.io.ObjectStreamField;

public class ObjectStreamField_3 {
    public static void main(String[] args) {
        ObjectStreamField field = new ObjectStreamField("name", String.class);
        Class<?> fieldType = field.getType();
        System.out.println("Field type: " + fieldType);
    }
}
