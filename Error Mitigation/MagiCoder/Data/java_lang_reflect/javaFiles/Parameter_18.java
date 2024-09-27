import java.lang.reflect.Parameter;
import java.lang.reflect.AnnotatedType;

public class Parameter_18 {
    public static void main(String[] args) {
        try {
            // Get the method
            Method method = Parameter_18.class.getMethod("add", String.class);

            // Get the parameters
            Parameter[] parameters = method.getParameters();

            // Get the AnnotatedType of the first parameter
            AnnotatedType annotatedType = parameters[0].getAnnotatedType();

            // Print the AnnotatedType
            System.out.println(annotatedType);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void add(String str) {
        // Method body
    }
}
