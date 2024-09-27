import javax.imageio.stream.MemoryCacheImageInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class MemoryCacheImageInputStream_1 {
    public static void main(String[] args) {
        byte[] data = { 72, 101, 108, 108, 111 }; // "Hello" in bytes
        try {
            ByteArrayInputStream inputStream = new ByteArrayInputStream(data);
            MemoryCacheImageInputStream imageInputStream = new MemoryCacheImageInputStream(inputStream);
            int value = imageInputStream.read();
            System.out.println("Value read from MemoryCacheImageInputStream: " + value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
