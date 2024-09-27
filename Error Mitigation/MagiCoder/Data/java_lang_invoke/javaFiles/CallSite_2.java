import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.CallSite;

public class CallSite_2 {
    public static void main(String[] args) {
        try {
            MethodHandles.Lookup lookup = MethodHandles.lookup();
            MethodHandles.MethodHandle handle = lookup.findVirtual(CallSite_2.class, "add", MethodType.methodType(void.class, String.class));
            CallSite site = CallSite.create(handle);
            MethodType type = site.type();
            System.out.println(type);
        } catch (NoSuchMethodException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public void add(String s) {
        System.out.println("Added: " + s);
    }
}
