import javax.imageio.stream.MemoryCacheImageInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class MemoryCacheImageInputStream_1 {
    public static void main(String[] args) {
        byte[] data = {65, 66, 67}; // Sample byte array
        ByteArrayInputStream inputStream = new ByteArrayInputStream(data);
        MemoryCacheImageInputStream imageInputStream = new MemoryCacheImageInputStream(inputStream);

        try {
            int byteValue = imageInputStream.read();
            System.out.println("Byte read: " + byteValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
