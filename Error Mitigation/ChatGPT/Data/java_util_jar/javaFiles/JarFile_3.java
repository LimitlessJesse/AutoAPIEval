import java.io.IOException;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

public class JarFile_3 {
    public static void main(String[] args) {
        try {
            JarFile jarFile = new JarFile("example.jar");
            Manifest manifest = jarFile.getManifest();
            System.out.println(manifest);
            jarFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
