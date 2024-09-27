import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class MethodHandle_1 {
    public static void main(String[] args) {
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        
        MethodHandle mh = MethodHandles.collectArguments(lookup.findStatic(
                Main.class, "myMethod", MethodType.methodType(void.class, String.class)), 0, String[].class);
        
        boolean isVarargsCollector = mh.isVarargsCollector();
        System.out.println("isVarargsCollector: " + isVarargsCollector);
    }
    
    public static void myMethod(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
