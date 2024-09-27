import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class InputStream_2 {
    public static void main(String[] args) {
        byte[] data = {65, 66, 67, 68, 69};
        InputStream input = new ByteArrayInputStream(data);
        byte[] buffer = new byte[5];
        try {
            int bytesRead = input.read(buffer);
            System.out.println("Bytes read: " + bytesRead);
            System.out.println("Data read: " + new String(buffer, 0, bytesRead));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
