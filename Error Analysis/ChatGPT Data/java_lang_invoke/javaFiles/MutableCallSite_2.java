import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandle;

public class MutableCallSite_2 {
    public static void main(String[] args) {
        MutableCallSite callSite = new MutableCallSite(MethodHandles.constant(String.class, "Hello"));
        MethodHandle target = callSite.getTarget();
        System.out.println("Target method handle: " + target);
    }
}
