import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MutableCallSite;

public class MutableCallSite_2 {
    public static void main(String[] args) {
        MethodHandle target = null; // Initialize target method handle
        MutableCallSite callSite = new MutableCallSite(target);
        
        MethodHandle retrievedTarget = callSite.getTarget();
        System.out.println("Retrieved target: " + retrievedTarget);
    }
}
