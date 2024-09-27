import java.io.ObjectStreamField;
import java.io.ObjectStreamClass;

public class ObjectStreamClass_5 {
    public static void main(String[] args) {
        ObjectStreamClass osc = ObjectStreamClass.lookup(String.class);
        ObjectStreamField[] fields = osc.getFields();
        
        for(ObjectStreamField field : fields) {
            System.out.println("Field name: " + field.getName());
            System.out.println("Field type: " + field.getType());
            System.out.println("Field offset: " + field.getOffset());
        }
    }
}
