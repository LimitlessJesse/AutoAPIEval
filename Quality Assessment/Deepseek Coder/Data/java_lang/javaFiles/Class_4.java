import java.lang.Class;

public class Class_4 {
    public static void main(String[] args) {
        ClassLoader classLoader = Class_4.class.getClassLoader();
        System.out.println(classLoader);
    }
}
