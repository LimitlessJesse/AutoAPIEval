import java.lang.annotation.Annotation;
import java.lang.reflect.Executable;

public class Executable_1 {
    public static void main(String[] args) {
        Executable executable = // obtain Executable object
        Annotation[] annotations = executable.getDeclaredAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
}
