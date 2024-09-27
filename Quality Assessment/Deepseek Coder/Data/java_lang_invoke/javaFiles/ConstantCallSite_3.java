import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;

public class ConstantCallSite_3 {
    public static void main(String[] args) throws Throwable {
        ArrayList<String> list = new ArrayList<>();

        // Create a method handle for the add method
        MethodType methodType = MethodType.methodType(boolean.class, String.class);
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodHandle addMethodHandle = lookup.findVirtual(ArrayList.class, "add", methodType);

        // Create a call site
        ConstantCallSite callSite = ConstantCallSite.create(addMethodHandle);

        // Get the target method handle
        MethodHandle targetMethodHandle = callSite.getTarget();

        // Invoke the target method handle
        targetMethodHandle.invokeExact(list, "Hello");

        System.out.println(list);
    }
}
