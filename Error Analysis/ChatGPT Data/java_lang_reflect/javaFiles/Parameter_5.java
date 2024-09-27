import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Parameter_5 {
    public static void main(String[] args) throws NoSuchMethodException {
        Method method = Main.class.getMethod("exampleMethod", String.class, int.class);
        Parameter[] parameters = method.getParameters();
        
        for (Parameter parameter : parameters) {
            Annotation[] annotations = parameter.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println("Annotation on parameter: " + annotation);
            }
        }
    }
    
    public static void exampleMethod(@Deprecated String text, @SuppressWarnings("unchecked") int number) {
        // Method implementation
    }
}
