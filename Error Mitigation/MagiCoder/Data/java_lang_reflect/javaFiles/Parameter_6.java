import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class Parameter_6 {
    public static void main(String[] args) throws NoSuchMethodException {
        Method method = Parameter_6.class.getMethod("add", String.class);
        Parameter[] parameters = method.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println("Parameter type: " + parameter.getType());
        }
    }

    public static boolean add(String e) {
        return true;
    }
}
