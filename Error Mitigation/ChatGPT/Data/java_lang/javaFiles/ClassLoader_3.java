import java.net.URL;

public class ClassLoader_3 {
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoader_3.class.getClassLoader();
        URL resource = classLoader.getResource("example.txt");
        
        if (resource != null) {
            System.out.println("Resource found: " + resource);
        } else {
            System.out.println("Resource not found.");
        }
    }
}
