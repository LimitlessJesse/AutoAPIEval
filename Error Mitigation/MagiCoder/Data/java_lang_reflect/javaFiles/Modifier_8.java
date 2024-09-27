import java.lang.reflect.Modifier;

public class Modifier_8 {
    public static void main(String[] args) {
        int mod = 0;
        boolean isSynchronized = Modifier.isSynchronized(mod);
        System.out.println(isSynchronized);
    }
}
