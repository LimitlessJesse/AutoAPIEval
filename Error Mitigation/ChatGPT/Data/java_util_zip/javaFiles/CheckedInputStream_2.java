import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.CheckedInputStream;

public class CheckedInputStream_2 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("example.zip");
            CheckedInputStream cis = new CheckedInputStream(fis, new CRC32());
            byte[] buffer = new byte[1024];
            int bytesRead = cis.read(buffer, 0, buffer.length);
            while (bytesRead != -1) {
                // Process the data read from the CheckedInputStream
                bytesRead = cis.read(buffer, 0, buffer.length);
            }
            cis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
