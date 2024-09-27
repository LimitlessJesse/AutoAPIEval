import java.util.jar.JarFile;
import java.util.jar.JarEntry;
import java.io.IOException;

public class JarFile_2 {
    public static void main(String[] args) {
        try {
            JarFile jarFile = new JarFile("example.jar");
            JarEntry entry = jarFile.getJarEntry("example.txt");
            
            if (entry != null) {
                System.out.println("Found entry: " + entry.getName());
            } else {
                System.out.println("Entry not found");
            }
            
            jarFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
