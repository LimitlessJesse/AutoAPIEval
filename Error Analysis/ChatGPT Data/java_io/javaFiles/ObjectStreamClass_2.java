import java.io.ObjectStreamClass;

public class ObjectStreamClass_2 {
    public static void main(String[] args) {
        ObjectStreamClass osc = ObjectStreamClass.lookup(String.class);
        String className = osc.getName();
        System.out.println("Class name: " + className);
    }
}
