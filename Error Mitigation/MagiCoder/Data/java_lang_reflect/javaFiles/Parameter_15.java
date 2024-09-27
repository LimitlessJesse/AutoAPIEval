import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Parameter_15 {
    public static void main(String[] args) throws Exception {
        Method method = Parameter_15.class.getMethod("isSyntheticMethod", int.class);
        Parameter[] parameters = method.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println("Parameter name: " + parameter.getName());
            System.out.println("Is synthetic: " + parameter.isSynthetic());
        }
    }

    public static void isSyntheticMethod(int i) {
        // This method does nothing
    }
}
