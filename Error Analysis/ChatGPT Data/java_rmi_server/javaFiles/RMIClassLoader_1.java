import java.rmi.server.RMIClassLoader;
import java.net.MalformedURLException;
import java.rmi.server.RMIClassLoaderSpi;
import java.rmi.server.RMIClassLoaderSpi;

public class RMIClassLoader_1 {
    public static void main(String[] args){
        try {
            Class<?> loadedClass = RMIClassLoader.loadClass("http://example.com", "ExampleClass");
            System.out.println("Loaded class: " + loadedClass.getName());
        } catch (MalformedURLException e) {
            System.out.println("Malformed URL Exception: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found Exception: " + e.getMessage());
        }
    }
}
