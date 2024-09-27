import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class MutableCallSite_4 {
    public static void main(String[] args) throws Throwable {
        ArrayList<String> list = new ArrayList<>();

        // Get the MethodHandle for the add method
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodHandle addMethodHandle = lookup.findVirtual(ArrayList.class, "add", MethodType.methodType(boolean.class, Object.class), ArrayList.class.getMethod("add", Object.class));

        // Create a MutableCallSite
        MutableCallSite callSite = new MutableCallSite();

        // Set the target of the call site to the add method handle
        callSite.setTarget(addMethodHandle);

        // Invoke the method using the call site
        callSite.dynamicInvoke(list, "Hello");

        System.out.println(list);
    }
}
