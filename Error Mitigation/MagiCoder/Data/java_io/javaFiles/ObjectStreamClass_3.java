import java.io.ObjectStreamClass;

public class ObjectStreamClass_3 {
    public static void main(String[] args) {
        ObjectStreamClass osc = ObjectStreamClass.lookup(Object.class);
        String className = osc.getName();
        System.out.println(className);
    }
}
