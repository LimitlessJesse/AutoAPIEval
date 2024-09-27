import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.AccessibleObject;

public class AccessibleObject_4 {
    
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MyAnnotation {
    }

    public static void main(String[] args) {
        // Check if the MyAnnotation annotation is present on the Main class
        boolean annotationPresent = Main.class.isAnnotationPresent(MyAnnotation.class);
        System.out.println("MyAnnotation is present on Main class: " + annotationPresent);
    }
}
