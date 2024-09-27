import java.lang.ClassLoader;

public class ClassLoader_5 {
    public static void main(String[] args) {
        ClassLoader classLoader = Main.class.getClassLoader();
        byte[] bytes = { 72, 101, 108, 108, 111 }; // ASCII values for "Hello"
        Class<?> clazz = classLoader.defineClass("Hello", bytes, 0, bytes.length);
        System.out.println(clazz.getName());
    }
}
