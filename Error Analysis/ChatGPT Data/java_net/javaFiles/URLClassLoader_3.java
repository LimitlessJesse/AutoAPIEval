import java.net.URL;
import java.net.URLClassLoader;

public class URLClassLoader_3 {
    public static void main(String[] args) {
        ClassLoader classLoader = Main.class.getClassLoader();
        if (classLoader instanceof URLClassLoader) {
            URL[] urls = ((URLClassLoader) classLoader).getURLs();
            for (URL url : urls) {
                System.out.println(url);
            }
        } else {
            System.out.println("Class loader is not an instance of URLClassLoader");
        }
    }
}
