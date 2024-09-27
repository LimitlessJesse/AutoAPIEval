import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

public class AccessibleObject_5 {
    public static void main(String[] args) {
        try {
            Method method = AccessibleObject_5.class.getMethod("someMethod");
            boolean isAnnotated = method.isAnnotationPresent(Override.class);
            System.out.println("Is the method annotated with @Override? " + isAnnotated);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "AccessibleObject_5{}";
    }

    public void someMethod() {
        System.out.println("This is someMethod");
    }
}
