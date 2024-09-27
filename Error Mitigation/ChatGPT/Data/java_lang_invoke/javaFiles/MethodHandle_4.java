import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class MethodHandle_4 {
    public static void main(String[] args) throws Throwable {
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodType methodType = MethodType.methodType(void.class, String.class);
        MethodHandle methodHandle = lookup.findVirtual(MethodHandle_4.class, "printMessage", methodType).bindTo(new MethodHandle_4());
        methodHandle.invokeExact("Hello");
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
