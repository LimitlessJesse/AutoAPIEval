import java.io.ObjectStreamClass;

public class ObjectStreamClass_1 {
    public static void main(String[] args) {
        ObjectStreamClass osc = ObjectStreamClass.lookup(ObjectStreamClass_1.class);
        String className = osc.getName();
        System.out.println("The internal name of the class is: " + className);
    }
}
