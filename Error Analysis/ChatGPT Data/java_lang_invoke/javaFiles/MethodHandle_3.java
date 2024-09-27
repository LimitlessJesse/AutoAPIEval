import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class MethodHandle_3 {
    public static void main(String[] args) throws Throwable {
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodHandle mh = lookup.findStatic(Math.class, "max", MethodType.methodType(int.class, int.class, int.class));
        int result = (int) mh.invokeExact(10, 20);
        System.out.println("Max value is: " + result);
    }
}
