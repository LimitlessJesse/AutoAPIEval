import java.lang.ClassLoader;

public class ClassLoader_2 {
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoader_2.class.getClassLoader();
        try {
            Class<?> clazz = classLoader.loadClass("java.lang.String");
            System.out.println("Class loaded successfully: " + clazz.getName());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}
