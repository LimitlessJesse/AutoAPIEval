import java.io.FileOutputStream;
import java.io.IOException;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.zip.ZipEntry;

public class JarOutputStream_1 {
    public static void main(String[] args) {
        try {
            JarOutputStream jos = new JarOutputStream(new FileOutputStream("example.jar"));
            ZipEntry entry = new JarEntry("example.txt");
            jos.putNextEntry(entry);
            jos.write("Hello, World!".getBytes());
            jos.closeEntry();
            jos.close();
            System.out.println("JAR file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
