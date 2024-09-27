import java.lang.reflect.Modifier;

public class Modifier_5 {
    public static void main(String[] args) {
        int mod = 0;
        mod = Modifier.ABSTRACT;
        boolean isAbstract = Modifier.isAbstract(mod);
        System.out.println("Is the modifier abstract? " + isAbstract);
    }
}
