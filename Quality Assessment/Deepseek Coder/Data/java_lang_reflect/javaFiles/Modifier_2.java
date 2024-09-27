import java.lang.reflect.Modifier;

public class Modifier_2 {
    public static void main(String[] args) {
        int modifiers = 1; // 1 is the modifier for public
        boolean isPublic = Modifier.isPublic(modifiers);
        System.out.println("Is the modifier public? " + isPublic);
    }
}
