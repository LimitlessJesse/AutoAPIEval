import java.net.URL;
import java.net.URLClassLoader;

public class URLClassLoader_2 {
    public static void main(String[] args) {
        URLClassLoader classLoader = (URLClassLoader) URLClassLoader_2.class.getClassLoader();
        URL resourceURL = classLoader.findResource("example.txt");
        
        if (resourceURL != null) {
            System.out.println("Resource found at: " + resourceURL);
        } else {
            System.out.println("Resource not found.");
        }
    }
}
