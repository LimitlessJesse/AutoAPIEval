import java.lang.reflect.AccessibleObject;
import java.lang.annotation.Annotation;

public class AccessibleObject_3 {
    public static void main(String[] args) {
        AccessibleObject accessibleObject = // initialize with a Field, Method, or Constructor object
        Annotation[] annotations = accessibleObject.getAnnotations();
        
        for (Annotation annotation : annotations) {
            System.out.println(annotation.annotationType().getName());
        }
    }
}
