import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class Constructor_3 {
    public static void main(String[] args) {
        Constructor<?>[] constructors = String.class.getConstructors();
        
        for(Constructor<?> constructor : constructors) {
            int modifiers = constructor.getModifiers();
            System.out.println("Modifiers: " + Modifier.toString(modifiers));
        }
    }
}
