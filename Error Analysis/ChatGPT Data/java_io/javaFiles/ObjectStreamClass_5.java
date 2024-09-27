import java.io.ObjectStreamClass;

public class ObjectStreamClass_5 {
    public static void main(String[] args) {
        Class<?> clazz = ObjectStreamClass.class;
        System.out.println("Class name: " + clazz.getName());
    }
}
