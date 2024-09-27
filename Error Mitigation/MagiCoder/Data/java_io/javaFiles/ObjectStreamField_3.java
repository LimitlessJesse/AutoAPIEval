import java.io.ObjectStreamField;

public class ObjectStreamField_3 {
    public static void main(String[] args) {
        ObjectStreamField[] fields = new ObjectStreamField[1];
        fields[0] = new ObjectStreamField("fieldName", String.class);
        ObjectStreamField field = fields[0];
        Class<?> type = field.getType();
        System.out.println(type);
    }
}
