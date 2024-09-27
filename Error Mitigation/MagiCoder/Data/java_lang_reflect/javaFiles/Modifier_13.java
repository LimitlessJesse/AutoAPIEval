import java.lang.reflect.Modifier;

public class Modifier_13 {
    public static void main(String[] args) {
        int mod = 0;
        boolean strictfp = Modifier.isStrict(mod);
        System.out.println("Is strictfp modifier present? " + strictfp);
    }
}
