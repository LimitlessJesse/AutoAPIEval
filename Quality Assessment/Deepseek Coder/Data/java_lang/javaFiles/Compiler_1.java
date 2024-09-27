import java.lang.reflect.Method;
import java.lang.Compiler;

public class Compiler_1 {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("java.lang.String");
            Method method = cls.getMethod("length");
            boolean result = Compiler.compileClass(cls);
            System.out.println("Compilation successful: " + result);
            System.out.println("Length of 'Hello': " + method.invoke("Hello"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
