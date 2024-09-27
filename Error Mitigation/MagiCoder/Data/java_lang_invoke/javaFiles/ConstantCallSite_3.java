import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class ConstantCallSite_3 {
    public static void main(String[] args) {
        try {
            MethodType methodType = MethodType.methodType(void.class, String.class);
            MethodHandle methodHandle = MethodHandles.lookup().findVirtual(ArrayList.class, "add", methodType);
            ConstantCallSite callSite = ConstantCallSite.create(methodHandle);

            MethodHandle target = callSite.getTarget();
            System.out.println(target);
        } catch (NoSuchMethodException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
