import java.util.zip.ZipInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ZipInputStream_6 {
    public static void main(String[] args) {
        byte[] data = "Hello, World!".getBytes();
        try (ZipInputStream zis = new ZipInputStream(new ByteArrayInputStream(data))) {
            int bytesAvailable = zis.available();
            System.out.println("Bytes available: " + bytesAvailable);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
