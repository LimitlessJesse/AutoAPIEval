import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;

public class MethodHandle_3 {
    public static void main(String[] args) {
        MethodHandle methodHandle = // initialize your MethodHandle here
        
        MethodType newType = MethodType.methodType(void.class, int.class, String.class);
        MethodHandle adaptedMethodHandle = methodHandle.asType(newType);
        
        // Use the adaptedMethodHandle as needed
    }
}
