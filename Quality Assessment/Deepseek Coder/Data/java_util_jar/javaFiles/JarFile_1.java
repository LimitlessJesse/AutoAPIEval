import java.util.jar.JarFile;
import java.util.jar.JarEntry;
import java.io.IOException;

public class JarFile_1 {
    public static void main(String[] args) {
        try {
            JarFile jarFile = new JarFile("path_to_your_jar_file");
            JarEntry jarEntry = jarFile.getJarEntry("name_of_the_entry");
            System.out.println(jarEntry.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
