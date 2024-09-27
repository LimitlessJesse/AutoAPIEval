import java.lang.reflect.Method;

public class ClassLoader_6 {
    public static void main(String[] args) {
        try {
            ClassLoader classLoader = ClassLoader.getSystemClassLoader();
            Class<?> loadedClass = classLoader.loadClass("java.util.ArrayList");

            Method method = loadedClass.getDeclaredMethod("add", Object.class);
            Object list = loadedClass.newInstance();

            method.invoke(list, "Hello");
            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
