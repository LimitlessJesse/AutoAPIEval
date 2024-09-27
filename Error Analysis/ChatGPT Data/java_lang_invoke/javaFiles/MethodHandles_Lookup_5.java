import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class MethodHandles_Lookup_5 {
    public static void main(String[] args) throws Throwable {
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodHandle mh = lookup.findVirtual(String.class, "length", MethodType.methodType(int.class));
        String str = "Hello MethodHandle";
        int length = (int) mh.invoke(str);
        System.out.println("Length of the string: " + length);
    }
}
