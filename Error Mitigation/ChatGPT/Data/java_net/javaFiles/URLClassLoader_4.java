import java.io.IOException;
import java.net.URLClassLoader;

public class URLClassLoader_4 {
    public static void main(String[] args) {
        URLClassLoader classLoader = new URLClassLoader(new URL[]{});
        
        try {
            classLoader.close();
            System.out.println("URLClassLoader closed successfully");
        } catch (IOException e) {
            System.out.println("Error closing URLClassLoader: " + e.getMessage());
        }
    }
}
