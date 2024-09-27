import java.rmi.server.RMIClassLoader;

public class RMIClassLoader_3 {
    public static void main(String[] args) {
        try {
            Class<?> loadedClass = RMIClassLoader.loadClass("java.lang.String");
            System.out.println("Loaded class: " + loadedClass.getName());
        } catch (Exception e) {
            System.out.println("Error loading class: " + e.getMessage());
        }
    }
}
