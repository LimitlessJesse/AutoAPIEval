import java.io.IOException;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;

public class JarEntry_5 {
    public static void main(String[] args) {
        try {
            JarEntry jarEntry = new JarEntry("example.jar");
            Attributes attributes = jarEntry.getAttributes();
            System.out.println("Manifest Attributes for entry: " + attributes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
