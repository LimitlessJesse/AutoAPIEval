import java.lang.Class;

public class Class_4 {
    public static void main(String[] args) {
        Class<?> cls = String.class;
        System.out.println(cls.isInterface()); // false
    }
}
