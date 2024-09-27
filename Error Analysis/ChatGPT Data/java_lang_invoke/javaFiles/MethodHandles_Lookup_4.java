import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.CallSite;

public class MethodHandles_Lookup_4 {
    public static void main(String[] args) {
        try {
            MethodHandles.Lookup lookup = MethodHandles.lookup();
            MethodType methodType = MethodType.methodType(void.class, String.class);
            MethodHandle methodHandle = lookup.findStatic(Main.class, "printMessage", methodType);

            methodHandle.invoke("Hello MethodHandle");
        } catch (NoSuchMethodException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}
