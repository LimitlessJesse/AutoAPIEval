import java.io.IOException;
import java.util.jar.JarInputStream;
import java.util.zip.ZipException;

public class JarInputStream_4 {
    public static void main(String[] args) {
        try {
            JarInputStream jarInputStream = new JarInputStream(/* provide input stream here */);
            byte[] buffer = new byte[1024];
            int bytesRead = jarInputStream.read(buffer, 0, buffer.length);
            System.out.println("Number of bytes read: " + bytesRead);
        } catch (IOException | ZipException e) {
            e.printStackTrace();
        }
    }
}
