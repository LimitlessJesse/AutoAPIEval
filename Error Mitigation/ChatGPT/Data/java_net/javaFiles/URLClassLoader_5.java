import java.net.URL;
import java.net.URLClassLoader;

public class URLClassLoader_5 {
    public static void main(String[] args) {
        URLClassLoader classLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
        try {
            URL url = new URL("file:/path/to/your/jar/file.jar");
            classLoader.addURL(url);
            System.out.println("URL added successfully");
        } catch (Exception e) {
            System.out.println("Error adding URL: " + e.getMessage());
        }
    }
}
