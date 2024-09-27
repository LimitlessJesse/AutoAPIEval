import java.lang.reflect.Modifier;

public class Modifier_10 {
    public static void main(String[] args) {
        int mod = 1024; // This is a random modifier, you can replace it with any modifier you want to check
        boolean isTransient = Modifier.isTransient(mod);
        System.out.println("Is the modifier transient? " + isTransient);
    }
}
