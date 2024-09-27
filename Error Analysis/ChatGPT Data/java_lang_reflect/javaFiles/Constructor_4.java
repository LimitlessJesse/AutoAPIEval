import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class Constructor_4 {
    public static void main(String[] args) {
        Constructor<?>[] constructors = Main.class.getConstructors();
        
        for(Constructor<?> constructor : constructors) {
            int modifiers = constructor.getModifiers();
            System.out.println("Constructor modifiers: " + Modifier.toString(modifiers));
        }
    }
}
