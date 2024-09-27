import java.lang.reflect.Modifier;

public class Modifier_2 {
    public static void main(String[] args) {
        int mod = 0;
        mod = Modifier.PUBLIC;
        boolean isPublic = Modifier.isPublic(mod);
        System.out.println("Is the modifier public? " + isPublic);
    }
}
