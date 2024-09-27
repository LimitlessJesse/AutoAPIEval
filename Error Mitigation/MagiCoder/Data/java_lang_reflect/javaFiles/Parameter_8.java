import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Parameter_8 {
    public static void main(String[] args) throws Exception {
        Method method = Parameter_8.class.getMethod("isVarArgsMethod", int.class, String.class);
        Parameter[] parameters = method.getParameters();

        for (Parameter parameter : parameters) {
            System.out.println("Parameter: " + parameter.getName());
            System.out.println("Is varargs: " + parameter.isVarArgs());
        }
    }

    public static void isVarArgsMethod(int i, String... strings) {
        // Method body
    }
}
