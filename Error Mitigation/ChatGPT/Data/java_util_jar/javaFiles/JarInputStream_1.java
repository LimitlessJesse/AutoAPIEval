import java.io.FileInputStream;
import java.io.IOException;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

public class JarInputStream_1 {
    public static void main(String[] args) {
        try {
            JarInputStream jarInputStream = new JarInputStream(new FileInputStream("example.jar"));
            JarEntry jarEntry;
            while ((jarEntry = jarInputStream.getNextJarEntry()) != null) {
                System.out.println("Jar Entry Name: " + jarEntry.getName());
            }
            jarInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
