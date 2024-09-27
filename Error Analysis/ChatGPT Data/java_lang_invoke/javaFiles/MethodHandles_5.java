import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;

public class MethodHandles_5 {
    public static void main(String[] args) {
        try {
            MethodHandle target = MethodHandles.constant(String.class, "Hello World");
            MethodHandle filter = MethodHandles.filterReturnValue(target, MethodHandles.permuteArguments(MethodHandles.identity(String.class), MethodType.methodType(String.class, String.class, String.class), 1, 0));
            
            String result = (String) filter.invokeExact();
            System.out.println(result);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
