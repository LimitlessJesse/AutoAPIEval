import java.lang.ClassLoader;

public class ClassLoader_1 {
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoader_1.class.getClassLoader();
        try {
            Class<?> clazz = classLoader.loadClass("java.lang.String");
            System.out.println("Class loaded: " + clazz.getName());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}
