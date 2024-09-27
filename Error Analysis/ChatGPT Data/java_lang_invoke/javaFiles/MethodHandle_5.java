import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class MethodHandle_5 {
    public static void main(String[] args) throws Throwable {
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodType methodType = MethodType.methodType(String.class, Object[].class);
        MethodHandle asVarargsCollectorHandle = lookup.findStatic(MethodHandle.class, "asVarargsCollector", methodType);
        MethodHandle varargsCollector = (MethodHandle) asVarargsCollectorHandle.invokeExact(String[].class);
        System.out.println(varargsCollector);
    }
}
