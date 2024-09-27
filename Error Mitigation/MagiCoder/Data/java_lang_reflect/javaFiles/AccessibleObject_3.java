import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public class AccessibleObject_3 {
    public static void main(String[] args) throws Exception {
        // Create a new instance of the class
        Class<?> clazz = Class.forName("java.lang.String");

        // Get the constructor
        Constructor<?> constructor = clazz.getConstructor(String.class);

        // Make the constructor accessible
        AccessibleObject.setAccessible(new AccessibleObject[] { constructor }, true);

        // Create a new instance of the class
        Object instance = constructor.newInstance("Hello");

        // Print the instance
        System.out.println(instance);
    }
}
