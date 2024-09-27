import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.io.IOException;

public class JarFile_5 {
    public static void main(String[] args) {
        try {
            JarFile jarFile = new JarFile("path_to_your_jar_file.jar");
            Manifest manifest = jarFile.getManifest();
            if (manifest!= null) {
                System.out.println(manifest.getJarFile_5Attributes());
            } else {
                System.out.println("No manifest found in the jar file.");
            }
            jarFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
