import java.lang.reflect.Method;

public class Method_2 {
    public static void main(String[] args) {
        Method method = Method_2.class.getMethod("main", String[].class);
        String methodName = method.getName();
        System.out.println("Method name: " + methodName);
    }
}
