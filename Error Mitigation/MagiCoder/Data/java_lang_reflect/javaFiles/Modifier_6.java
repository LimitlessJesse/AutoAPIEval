import java.lang.reflect.Modifier;

public class Modifier_6 {
    public static void main(String[] args) {
        int mod = 10; // 10 is the binary representation of the modifier 'public'
        boolean isStatic = Modifier.isStatic(mod);
        System.out.println("Is the modifier 'public' static? " + isStatic);
    }
}
