import java.net.URL;
import java.net.URLClassLoader;
import java.io.IOException;
import java.util.Enumeration;

public class URLClassLoader_3 {
    public static void main(String[] args) {
        URLClassLoader classLoader = (URLClassLoader) URLClassLoader_3.class.getClassLoader();
        
        try {
            Enumeration<URL> resources = classLoader.findResources("example.txt");
            
            while (resources.hasMoreElements()) {
                URL resource = resources.nextElement();
                System.out.println("Found resource: " + resource);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
