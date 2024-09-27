import java.io.IOException;
import java.io.InputStream;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

public class JarFile_5 {
    public static void main(String[] args) {
        try {
            JarFile jarFile = new JarFile("example.jar");
            ZipEntry entry = jarFile.getEntry("example.txt");
            InputStream inputStream = jarFile.getInputStream(entry);
            
            // Read from the input stream
            int data = inputStream.read();
            while (data != -1) {
                System.out.print((char) data);
                data = inputStream.read();
            }
            
            inputStream.close();
            jarFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
