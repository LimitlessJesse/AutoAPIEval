import java.io.FileInputStream;
import java.io.IOException;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

public class JarInputStream_2 {
    public static void main(String[] args) {
        try (JarInputStream jarInputStream = new JarInputStream(new FileInputStream("path_to_your_jar_file"))) {
            JarEntry jarEntry;
            while ((jarEntry = jarInputStream.getNextJarEntry())!= null) {
                System.out.println("Jar entry: " + jarEntry.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
