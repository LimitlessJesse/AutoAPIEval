import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;

public class ConstantCallSite_4 {
    public static void main(String[] args) {
        MethodHandle target = null; // Define a MethodHandle
        ConstantCallSite callSite = new ConstantCallSite(target);
        
        try {
            callSite.setTarget(MethodHandle.empty()); // This will throw an UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            System.out.println("UnsupportedOperationException caught: " + e.getMessage());
        }
    }
}
