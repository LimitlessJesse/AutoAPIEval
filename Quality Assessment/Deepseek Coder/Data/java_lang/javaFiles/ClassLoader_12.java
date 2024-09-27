import java.lang.reflect.Method;

public class ClassLoader_12 {
    public static void main(String[] args) {
        try {
            ClassLoader classLoader = ClassLoader.getSystemClassLoader();
            Class<?> clazz = classLoader.findClass("java.util.ArrayList");

            Method method = clazz.getMethod("add", Object.class);
            Object list = clazz.newInstance();
            method.invoke(list, "Hello");

            Method method2 = clazz.getMethod("toString");
            System.out.println(method2.invoke(list));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
