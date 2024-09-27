import java.net.URL;
import java.net.URLClassLoader;
import java.io.IOException;
import java.util.Enumeration;

public class URLClassLoader_6 {
    public static void main(String[] args) {
        URLClassLoader loader = new URLClassLoader(new URL[] {});
        try {
            Enumeration<URL> resources = loader.findResources("someResource");
            while (resources.hasMoreElements()) {
                System.out.println(resources.nextElement());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
