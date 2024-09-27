import java.util.jar.JarFile;
import java.util.jar.JarEntry;
import java.io.IOException;

public class JarFile_2 {
    public static void main(String[] args) {
        try {
            JarFile jarFile = new JarFile("path_to_your_jar_file.jar");
            JarEntry jarEntry = jarFile.getJarEntry("entry_name");
            if (jarEntry!= null) {
                System.out.println("JarEntry found: " + jarEntry.getName());
            } else {
                System.out.println("JarEntry not found.");
            }
            jarFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
