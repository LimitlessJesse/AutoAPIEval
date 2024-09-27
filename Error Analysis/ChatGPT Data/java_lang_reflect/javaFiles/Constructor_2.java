import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

public class Constructor_2 {
    public static void main(String[] args) {
        // Get the constructor of a class
        try {
            Constructor<?> constructor = MyClass.class.getConstructor(int.class, String.class);
            
            // Get the declared annotations for the constructor
            Annotation[] annotations = constructor.getDeclaredAnnotations();
            
            // Print out the annotations
            for (Annotation annotation : annotations) {
                System.out.println(annotation);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

class MyClass {
    @MyAnnotation
    public MyClass(int value, String name) {
        // Constructor implementation
    }
}

@interface MyAnnotation {
    String value() default "";
}
