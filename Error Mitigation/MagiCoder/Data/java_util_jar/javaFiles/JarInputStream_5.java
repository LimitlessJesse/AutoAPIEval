import java.io.FileInputStream;
import java.io.IOException;
import java.util.jar.JarInputStream;
import java.util.jar.Manifest;

public class JarInputStream_5 {
    public static void main(String[] args) {
        try (JarInputStream jarInputStream = new JarInputStream(new FileInputStream("path_to_your_jar_file.jar"))) {
            Manifest manifest = jarInputStream.getManifest();
            if (manifest!= null) {
                System.out.println(manifest.getJarInputStream_5Attributes());
            } else {
                System.out.println("No manifest found in the JAR file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
