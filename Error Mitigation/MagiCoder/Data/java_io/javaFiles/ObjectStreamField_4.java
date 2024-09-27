import java.io.ObjectStreamField;

public class ObjectStreamField_4 {
    public static void main(String[] args) {
        ObjectStreamField field = new ObjectStreamField("fieldName", int.class);
        int offset = field.getOffset();
        System.out.println("Offset: " + offset);
    }
}
