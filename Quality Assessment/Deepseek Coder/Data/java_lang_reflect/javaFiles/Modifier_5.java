import java.lang.reflect.Modifier;

public class Modifier_5 {
    public static void main(String[] args) {
        int modifiers = 1024; // This is an example of modifiers, it represents the 'public' modifier
        boolean isStatic = Modifier.isStatic(modifiers);
        System.out.println("Is the modifier'static'? " + isStatic);
    }
}
