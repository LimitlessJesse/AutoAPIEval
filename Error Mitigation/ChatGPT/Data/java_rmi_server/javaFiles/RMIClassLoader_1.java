import java.rmi.server.RMIClassLoader;
import java.net.MalformedURLException;

public class RMIClassLoader_1 {
    public static void main(String[] args) {
        try {
            String codebase = "http://example.com/classes/";
            String className = "com.example.MyClass";
            Class<?> loadedClass = RMIClassLoader.loadClass(codebase, className);
            System.out.println("Loaded class: " + loadedClass.getName());
        } catch (MalformedURLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
