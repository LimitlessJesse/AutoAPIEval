import java.lang.reflect.Method;

public class Method_1 {
    public static void main(String[] args) {
        Method method = Method_1.class.getMethod("main", String[].class);
        Class<?> declaringClass = method.getDeclaringClass();
        System.out.println("Declaring class: " + declaringClass.getName());
    }
}
