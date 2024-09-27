import java.lang.reflect.Modifier;

public class Modifier_9 {
    public static void main(String[] args) {
        int mod = 1024; // This is a random modifier. You can replace it with any modifier.
        boolean isVolatile = Modifier.isVolatile(mod);
        System.out.println("Is the modifier volatile? " + isVolatile);
    }
}
