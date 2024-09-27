import java.util.zip.ZipInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ZipInputStream_3 {
    public static void main(String[] args) {
        try (ZipInputStream zipStream = new ZipInputStream(new FileInputStream("example.zip"))) {
            byte[] buffer = new byte[1024];
            int bytesRead = zipStream.read(buffer, 0, buffer.length);
            System.out.println("Bytes read: " + bytesRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
