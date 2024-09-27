import java.io.ObjectStreamClass;
import java.io.ObjectStreamField;

public class ObjectStreamClass_2 {
    public static void main(String[] args) {
        ObjectStreamClass osc = ObjectStreamClass.lookup(String.class);
        ObjectStreamField field = osc.getField("hash");
        System.out.println("Field name: " + field.getName());
        System.out.println("Field type: " + field.getType());
    }
}
