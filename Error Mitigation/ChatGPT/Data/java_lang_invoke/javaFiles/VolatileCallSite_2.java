import java.lang.invoke.MethodHandle;
import java.lang.invoke.VolatileCallSite;

public class VolatileCallSite_2 {
    public static void main(String[] args) {
        VolatileCallSite callSite = new VolatileCallSite();
        MethodHandle target = callSite.getTarget();
        System.out.println("Target method handle: " + target);
    }
}
