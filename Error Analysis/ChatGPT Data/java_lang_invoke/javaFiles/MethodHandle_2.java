import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;

public class MethodHandle_2 {
    public static void main(String[] args) {
        MethodType methodType = MethodType.methodType(void.class, String.class);
        System.out.println(methodType);
    }
}
