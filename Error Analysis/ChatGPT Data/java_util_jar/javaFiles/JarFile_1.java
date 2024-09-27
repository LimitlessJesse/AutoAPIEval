import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.Enumeration;
import java.io.IOException;

public class JarFile_1 {
    public static void main(String[] args) {
        try {
            JarFile jarFile = new JarFile("path/to/your/jar/file.jar");
            Enumeration<JarEntry> entries = jarFile.entries();
            
            while(entries.hasMoreElements()) {
                JarEntry entry = entries.nextElement();
                System.out.println(entry.getName());
            }
            
            jarFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
