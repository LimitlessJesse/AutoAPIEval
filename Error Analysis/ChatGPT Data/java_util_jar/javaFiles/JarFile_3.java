import java.util.jar.JarFile;
import java.io.IOException;

public class JarFile_3 {
    public static void main(String[] args) {
        try {
            JarFile jarFile = new JarFile("example.jar");
            Manifest manifest = jarFile.getManifest();
            System.out.println("Manifest of the JAR file:");
            System.out.println(manifest);
            jarFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
