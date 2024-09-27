import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandle;

public class MutableCallSite_1 {
    public static void main(String[] args) {
        MutableCallSite callSite = new MutableCallSite(MethodHandle.empty());
        MethodHandle newTarget = MethodHandle.constant(String.class, "New Target");
        
        try {
            callSite.setTarget(newTarget);
            System.out.println("New target set successfully");
        } catch (NullPointerException e) {
            System.out.println("Error: Proposed new target is null");
        } catch (WrongMethodTypeException e) {
            System.out.println("Error: Proposed new target has a method type that differs from the previous target");
        }
    }
}
