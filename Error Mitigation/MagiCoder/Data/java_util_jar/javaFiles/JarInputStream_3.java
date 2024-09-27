import java.io.FileInputStream;
import java.io.IOException;
import java.util.jar.JarInputStream;

public class JarInputStream_3 {
    public static void main(String[] args) {
        try (JarInputStream jarInputStream = new JarInputStream(new FileInputStream("path_to_your_jar_file"))) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = jarInputStream.read(buffer))!= -1) {
                // Process the bytes read
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
