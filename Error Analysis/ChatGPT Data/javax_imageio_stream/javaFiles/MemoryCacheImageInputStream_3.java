import javax.imageio.stream.MemoryCacheImageInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class MemoryCacheImageInputStream_3 {
    public static void main(String[] args) {
        byte[] data = {65, 66, 67, 68, 69}; // Sample byte array
        ByteArrayInputStream inputStream = new ByteArrayInputStream(data);
        MemoryCacheImageInputStream imageInputStream = new MemoryCacheImageInputStream(inputStream);

        byte[] buffer = new byte[3]; // Buffer to read data into
        int bytesRead;
        try {
            bytesRead = imageInputStream.read(buffer, 0, buffer.length);
            System.out.println("Bytes read: " + bytesRead);
            // Print the bytes read from the input stream
            for (int i = 0; i < bytesRead; i++) {
                System.out.println("Byte " + i + ": " + buffer[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
