import java.lang.reflect.Modifier;

public class Modifier_4 {
    public static void main(String[] args) {
        int mod = 1; // 1 is the private modifier in java
        boolean isPrivate = Modifier.isPrivate(mod);
        System.out.println(isPrivate);
    }
}
