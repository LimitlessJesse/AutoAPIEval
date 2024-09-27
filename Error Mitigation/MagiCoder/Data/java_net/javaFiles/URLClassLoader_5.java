import java.net.URL;
import java.net.URLClassLoader;
import java.io.IOException;

public class URLClassLoader_5 {
    public static void main(String[] args) {
        URLClassLoader classLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
        try {
            URL url = classLoader.findResource("java/lang/String.class");
            if (url!= null) {
                System.out.println("Resource found at: " + url.toString());
            } else {
                System.out.println("Resource not found");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
