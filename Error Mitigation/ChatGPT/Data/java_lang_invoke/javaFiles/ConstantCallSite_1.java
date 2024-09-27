import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;

public class ConstantCallSite_1 {
    public static void main(String[] args) {
        MethodHandle methodHandle = null; // Initialize with the desired MethodHandle
        ConstantCallSite constantCallSite = new ConstantCallSite(methodHandle);
        MethodHandle permanentTarget = constantCallSite.dynamicInvoker();
        System.out.println("Permanent target: " + permanentTarget);
    }
}
