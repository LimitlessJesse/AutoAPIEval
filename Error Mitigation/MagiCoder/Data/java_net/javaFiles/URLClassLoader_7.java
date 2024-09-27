import java.net.URLClassLoader;
import java.io.IOException;

public class URLClassLoader_7 {
    public static void main(String[] args) {
        URLClassLoader loader = new URLClassLoader(new java.net.URL[]{});
        try {
            loader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
