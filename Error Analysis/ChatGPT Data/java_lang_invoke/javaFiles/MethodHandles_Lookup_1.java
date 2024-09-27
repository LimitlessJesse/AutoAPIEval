import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Constructor;

public class MethodHandles_Lookup_1 {
    public static void main(String[] args) throws Throwable {
        Constructor<String> constructor = String.class.getConstructor(String.class);
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodHandle handle = lookup.unreflectConstructor(constructor);
        
        String result = (String) handle.invoke("MethodHandle Example");
        System.out.println(result);
    }
}
