import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.io.File;
import java.util.Enumeration;
import java.util.jar.JarEntry;

public class JarFile_4 {
    public static void main(String[] args) {
        try {
            JarFile jarFile = new JarFile(new File("path_to_your_jar_file.jar"));
            Manifest manifest = jarFile.getManifest();
            Enumeration<JarEntry> entries = jarFile.entries();

            while (entries.hasMoreElements()) {
                JarEntry entry = entries.nextElement();
                System.out.println(entry.getName());
            }

            jarFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
