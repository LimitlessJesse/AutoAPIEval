import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public class ClassLoader_4 {
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoader_4.class.getClassLoader();
        try {
            Enumeration<URL> resources = classLoader.getResources("example.txt");
            while (resources.hasMoreElements()) {
                URL url = resources.nextElement();
                System.out.println(url);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
