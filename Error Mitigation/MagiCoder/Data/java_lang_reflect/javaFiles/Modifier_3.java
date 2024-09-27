import java.lang.reflect.Modifier;

public class Modifier_3 {
    public static void main(String[] args) {
        int mod = 0;
        mod = Modifier.PROTECTED;
        boolean isProtected = Modifier.isProtected(mod);
        System.out.println("Is the modifier protected? " + isProtected);
    }
}
