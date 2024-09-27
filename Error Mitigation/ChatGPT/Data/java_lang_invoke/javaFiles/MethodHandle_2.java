import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;

public class MethodHandle_2 {
    public static void main(String[] args) {
        MethodHandle mh = null; // Initialize your MethodHandle here
        MethodType type = mh.type();
        System.out.println("Method handle type: " + type);
    }
}
