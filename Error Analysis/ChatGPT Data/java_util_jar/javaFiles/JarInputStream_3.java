import java.io.FileInputStream;
import java.io.IOException;
import java.util.jar.JarInputStream;
import java.util.jar.Manifest;

public class JarInputStream_3 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("sample.jar");
            JarInputStream jis = new JarInputStream(fis);
            Manifest manifest = jis.getManifest();

            System.out.println("Main Attributes:");
            System.out.println(manifest.getMainAttributes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
