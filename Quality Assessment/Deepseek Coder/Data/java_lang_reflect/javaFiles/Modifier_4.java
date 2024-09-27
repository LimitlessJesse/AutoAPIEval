import java.lang.reflect.Modifier;

public class Modifier_4 {
    public static void main(String[] args) {
        int modifiers = 100; // This is a sample modifier, you can replace it with any integer value
        boolean isProtected = Modifier.isProtected(modifiers);
        System.out.println("Is the modifier protected? " + isProtected);
    }
}
