import java.lang.invoke.MethodHandle;
import java.lang.invoke.VolatileCallSite;

public class VolatileCallSite_1 {
    public static void main(String[] args) {
        VolatileCallSite callSite = new VolatileCallSite(MethodHandles.constant(String.class, "Initial target"));
        
        System.out.println("Current target: " + callSite.getTarget());
        
        MethodHandle newTarget = MethodHandles.constant(String.class, "New target");
        callSite.setTarget(newTarget);
        
        System.out.println("Updated target: " + callSite.getTarget());
    }
}
