import java.net.URL;

public class ClassLoader_13 {
    public static void main(String[] args) {
        // Get the class loader
        ClassLoader classLoader = ClassLoader_13.class.getClassLoader();
        
        // Get the resource
        URL resource = classLoader.getResource("example.txt");
        
        if (resource!= null) {
            System.out.println("Resource found: " + resource.getFile());
        } else {
            System.out.println("Resource not found");
        }
    }
}
