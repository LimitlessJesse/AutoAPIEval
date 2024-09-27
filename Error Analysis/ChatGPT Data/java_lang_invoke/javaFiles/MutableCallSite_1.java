import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class MutableCallSite_1 {
    public static void main(String[] args) {
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MutableCallSite callSite = new MutableCallSite(MethodType.methodType(void.class, String.class));
        MethodHandle target = lookup.findVirtual(System.out.getClass(), "println", MethodType.methodType(void.class, String.class));
        callSite.setTarget(target);
        
        try {
            callSite.dynamicInvoker().invokeExact("Hello, MutableCallSite!");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
