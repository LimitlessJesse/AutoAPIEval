import javax.imageio.stream.MemoryCacheImageInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class MemoryCacheImageInputStream_2 {
    public static void main(String[] args) {
        byte[] data = {65, 66, 67, 68, 69}; // Sample byte array data
        ByteArrayInputStream inputStream = new ByteArrayInputStream(data);
        MemoryCacheImageInputStream imageInputStream = new MemoryCacheImageInputStream(inputStream);

        byte[] buffer = new byte[3];
        try {
            int bytesRead = imageInputStream.read(buffer, 0, 3);
            System.out.println("Number of bytes read: " + bytesRead);
            System.out.println("Bytes read: ");
            for (byte b : buffer) {
                System.out.print(b + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
