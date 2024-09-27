import java.net.URL;
import java.rmi.server.RMIClassLoader;

public class RMIClassLoader_2 {
    public static void main(String[] args) {
        try {
            URL codebase = new URL("http://example.com/classes/");
            String className = "com.example.MyClass";
            Class<?> loadedClass = RMIClassLoader.loadClass(codebase, className);
            System.out.println("Loaded class: " + loadedClass.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
