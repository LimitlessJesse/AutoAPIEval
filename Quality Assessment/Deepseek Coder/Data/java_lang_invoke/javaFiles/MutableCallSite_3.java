import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class MutableCallSite_3 {
    public static void main(String[] args) throws Throwable {
        ArrayList<String> list = new ArrayList<>();

        // Get the MethodHandle for the add method
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodHandle addMethodHandle = lookup.findVirtual(ArrayList.class, "add", MethodType.methodType(boolean.class, Object.class), ArrayList.class);

        // Create a MutableCallSite
        MutableCallSite callSite = new MutableCallSite(addMethodHandle);

        // Invoke the method through the call site
        callSite.dynamicInvoker().invokeExact(list, "Hello");

        System.out.println(list);

        // Get the target method handle
        MethodHandle target = callSite.getTarget();
        System.out.println(target.type());  // prints: (Ljava/lang/Object;)Z

        // Get the method
        Method method = ((MethodHandles.Lookup) target.lookup()).reflect();
        System.out.println(method.getName());  // prints: add
    }
}
