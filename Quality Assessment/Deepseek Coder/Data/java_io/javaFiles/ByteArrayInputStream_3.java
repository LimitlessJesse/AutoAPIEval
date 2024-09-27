import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStream_3 {
    public static void main(String[] args) {
        byte[] buffer = {1, 2, 3, 4, 5};
        ByteArrayInputStream inputStream = new ByteArrayInputStream(buffer);

        byte[] readBuffer = new byte[2];
        try {
            int bytesRead = inputStream.read(readBuffer, 0, readBuffer.length);
            System.out.println("Bytes read: " + bytesRead);
            System.out.println("Read buffer: " + new String(readBuffer));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
