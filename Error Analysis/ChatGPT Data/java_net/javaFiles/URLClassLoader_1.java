import java.net.URL;
import java.net.URLClassLoader;

public class URLClassLoader_1 {
    public static void main(String[] args) throws Exception {
        URL[] urls = new URL[] {new URL("file:/path/to/your/class/files/")};
        URLClassLoader urlClassLoader = new URLClassLoader(urls);
        Class<?> clazz = urlClassLoader.loadClass("com.example.MyClass");
        System.out.println("Loaded class: " + clazz.getName());
    }
}
