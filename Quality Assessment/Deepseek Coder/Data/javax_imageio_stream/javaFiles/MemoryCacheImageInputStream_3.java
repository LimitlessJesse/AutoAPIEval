import javax.imageio.stream.MemoryCacheImageInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class MemoryCacheImageInputStream_3 {
    public static void main(String[] args) {
        try {
            // Create a new MemoryCacheImageInputStream
            MemoryCacheImageInputStream inputStream = new MemoryCacheImageInputStream(new ByteArrayInputStream(new byte[]{1, 2, 3, 4, 5}));

            // Create a byte array to store the read data
            byte[] data = new byte[5];

            // Read data from the input stream
            int read = inputStream.read(data, 0, 5);

            // Print the number of bytes read and the data
            System.out.println("Bytes read: " + read);
            System.out.println("Data: " + new String(data));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
