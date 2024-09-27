import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Method;

public class MutableCallSite_3 {
    public static void main(String[] args) throws Throwable {
        // Create a new MutableCallSite
        MutableCallSite callSite = new MutableCallSite();

        // Get the MethodHandle for the add method of ArrayList
        Method method = ArrayList.class.getMethod("add", Object.class);
        MethodHandle methodHandle = MethodHandles.lookup().unreflect(method);

        // Set the target of the call site to the add method
        callSite.setTarget(methodHandle);

        // Create a new ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Invoke the add method through the call site
        callSite.dynamicInvoker().invokeExact(list, "Hello");

        // Print the list to verify the addition
        System.out.println(list);
    }
}
