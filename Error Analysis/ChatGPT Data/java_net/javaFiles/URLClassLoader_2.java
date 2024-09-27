import java.net.URL;
import java.net.URLClassLoader;

public class URLClassLoader_2 {
    public static void main(String[] args) {
        try {
            URL[] urls = { new URL("file:/path/to/jarFile.jar") };
            URLClassLoader classLoader = new URLClassLoader(urls);
            // Use the classLoader for loading classes
            classLoader.close(); // Close the class loader
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
