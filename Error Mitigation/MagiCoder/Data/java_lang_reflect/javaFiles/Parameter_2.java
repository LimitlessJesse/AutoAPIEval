import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Parameter_2 {
    public static void main(String[] args) throws NoSuchMethodException {
        Method method = Parameter_2.class.getMethod("add", String.class);
        Parameter[] parameters = method.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println("Parameter: " + parameter.getName());
            System.out.println("Annotations: " + java.util.Arrays.toString(parameter.getAnnotations()));
        }
    }

    public static boolean add(String e) {
        return true;
    }
}
