import java.lang.reflect.Modifier;

public class Modifier_7 {
    public static void main(String[] args) {
        int mod = 10; // 10 is the binary representation of the modifier 'final'
        boolean isFinal = Modifier.isFinal(mod);
        System.out.println(isFinal);
    }
}
