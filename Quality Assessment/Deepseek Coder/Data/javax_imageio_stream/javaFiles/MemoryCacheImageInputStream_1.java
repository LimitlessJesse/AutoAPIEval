import javax.imageio.stream.MemoryCacheImageInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class MemoryCacheImageInputStream_1 {
    public static void main(String[] args) {
        try {
            // Create a new MemoryCacheImageInputStream
            MemoryCacheImageInputStream inputStream = new MemoryCacheImageInputStream(new ByteArrayInputStream("Hello, World!".getBytes()));

            // Read from the input stream
            int data;
            while ((data = inputStream.read())!= -1) {
                System.out.print((char) data);
            }

            // Close the input stream
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
