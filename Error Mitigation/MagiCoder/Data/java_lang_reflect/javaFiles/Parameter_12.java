import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Parameter_12 {
    public static void main(String[] args) throws Exception {
        Method method = Parameter_12.class.getMethod("add", String.class);
        Parameter[] parameters = method.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println("Parameter: " + parameter.getName());
            for (java.lang.annotation.Annotation annotation : parameter.getDeclaredAnnotations()) {
                System.out.println("Annotation: " + annotation.toString());
            }
        }
    }

    public static void add(String str) {
        System.out.println("Adding: " + str);
    }
}
