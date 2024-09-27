import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class MethodHandle_4 {
    public static void main(String[] args) throws Throwable {
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodType initialType = MethodType.methodType(void.class, String.class);
        MethodHandle mh = lookup.findVirtual(Main.class, "exampleMethod", initialType);

        MethodType newType = MethodType.methodType(void.class, Object.class);
        MethodHandle convertedMH = mh.asType(newType);

        Object argument = "Hello";
        convertedMH.invokeExact(argument);
    }

    public void exampleMethod(String str) {
        System.out.println("Received String: " + str);
    }
}
