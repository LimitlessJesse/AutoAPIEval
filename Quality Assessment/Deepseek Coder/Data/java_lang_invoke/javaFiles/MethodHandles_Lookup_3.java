import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;

public class MethodHandles_Lookup_3 {
    public static void main(String[] args) throws Throwable {
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodHandle handle = lookup.findStatic(ArrayList.class, "add", MethodType.methodType(boolean.class, Object.class));
        ArrayList<String> list = new ArrayList<>();
        handle.invoke(list, "Hello");
        System.out.println(list);
    }
}
