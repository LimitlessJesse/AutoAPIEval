import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;

public class MutableCallSite_5 {
    public static void main(String[] args) throws Throwable {
        MethodHandle methodHandle = MethodHandles.lookup().findVirtual(MutableCallSite_5.class, "add", String.class);
        MutableCallSite callSite = new MutableCallSite(methodHandle);
        MethodHandle target = callSite.getTarget();
        System.out.println(target);
    }

    public void add(String s) {
        System.out.println("Added: " + s);
    }
}
