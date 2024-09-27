import java.lang.reflect.Modifier;

public class Modifier_12 {
    public static void main(String[] args) {
        int mod = 1024; // This is a sample modifier, you can use any integer value
        boolean isInterface = Modifier.isInterface(mod);
        System.out.println("Is the modifier an interface? " + isInterface);
    }
}
