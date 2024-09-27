import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;

public class MethodHandles_Lookup_4 {
    public static void main(String[] args) throws Throwable {
        ArrayList<String> list = new ArrayList<>();
        MethodType methodType = MethodType.methodType(boolean.class, Object.class);
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodHandle methodHandle = lookup.findVirtual(ArrayList.class, "add", methodType);
        methodHandle.invoke(list, "Hello");
        System.out.println(list);
    }
}
