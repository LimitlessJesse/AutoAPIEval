import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class JarInputStream_1 {
    public static void main(String[] args) {
        try (JarInputStream jarFile = new JarInputStream(new FileInputStream("example.jar"))) {

            JarEntry entry = null;
            while ((entry = jarFile.getNextJarEntry()) != null) {
                System.out.println("Entry Name: " + entry.getName());
                System.out.println("Entry Size: " + entry.getSize());
                System.out.println("Is Directory: " + entry.isDirectory());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
