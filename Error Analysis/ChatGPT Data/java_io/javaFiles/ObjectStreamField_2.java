import java.io.ObjectStreamField;
import java.io.Serializable;

public class ObjectStreamField_2 {
    public static void main(String[] args) {
        ObjectStreamField field = new ObjectStreamField("fieldName", Serializable.class);
        int offset = field.getOffset();
        System.out.println("Offset: " + offset);
    }
}
