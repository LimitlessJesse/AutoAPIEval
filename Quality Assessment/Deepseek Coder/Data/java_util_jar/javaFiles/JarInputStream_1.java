import java.util.jar.JarInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class JarInputStream_1 {
    public static void main(String[] args) {
        try {
            JarInputStream jarInputStream = new JarInputStream(new FileInputStream("path_to_your_jar_file"));
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = jarInputStream.read(buffer, 0, buffer.length))!= -1) {
                // Process the read bytes
            }
            jarInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
