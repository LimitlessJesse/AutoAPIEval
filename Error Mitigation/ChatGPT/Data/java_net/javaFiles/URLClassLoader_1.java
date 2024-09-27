import java.net.URLClassLoader;

public class URLClassLoader_1 {
    public static void main(String[] args) {
        URLClassLoader classLoader = new URLClassLoader(new URL[]{});
        try {
            Class<?> myClass = classLoader.findClass("MyClass");
            System.out.println("Class found: " + myClass.getName());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}
