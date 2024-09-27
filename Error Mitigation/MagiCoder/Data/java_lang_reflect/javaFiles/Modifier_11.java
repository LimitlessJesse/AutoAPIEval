import java.lang.reflect.Modifier;

public class Modifier_11 {
    public static void main(String[] args) {
        int mod = 0;
        boolean isNative = Modifier.isNative(mod);
        System.out.println("Is native: " + isNative);
    }
}
