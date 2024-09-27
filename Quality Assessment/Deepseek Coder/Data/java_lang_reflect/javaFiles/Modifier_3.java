import java.lang.reflect.Modifier;

public class Modifier_3 {
    public static void main(String[] args) {
        int modifiers = 10; // This is an example of modifiers, it represents the private modifier
        boolean isPrivate = Modifier.isPrivate(modifiers);
        System.out.println("Is the modifier private? " + isPrivate);
    }
}
