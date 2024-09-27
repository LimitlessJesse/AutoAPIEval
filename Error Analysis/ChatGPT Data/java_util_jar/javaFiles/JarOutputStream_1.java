import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.zip.ZipEntry;

public class JarOutputStream_1 {
    public static void main(String[] args) {
        try (JarOutputStream jarOut = new JarOutputStream(new FileOutputStream("output.jar"))) {
            ZipEntry entry = new ZipEntry("file.txt");
            jarOut.putNextEntry(entry);
            byte[] data = "Hello, this is a test file.".getBytes();
            jarOut.write(data, 0, data.length);
            jarOut.closeEntry();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
