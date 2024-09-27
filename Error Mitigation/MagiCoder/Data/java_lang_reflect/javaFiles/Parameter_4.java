import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Parameter_4 {
    public static void main(String[] args) throws Exception {
        Method method = Parameter_4.class.getMethod("exampleMethod", String.class);
        Parameter[] parameters = method.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter.getName());
        }
    }

    public static void exampleMethod(String param) {
        // Method body
    }
}
