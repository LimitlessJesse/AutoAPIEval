import java.lang.reflect.Method;

public class ClassLoader_3 {
    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        Class<?> clazz = classLoader.loadClass("java.lang.String");
        Method method = clazz.getMethod("length");
        Object obj = clazz.newInstance();
        System.out.println(method.invoke(obj));
    }
}
