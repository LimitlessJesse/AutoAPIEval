import javax.imageio.stream.MemoryCacheImageOutputStream;
import java.io.IOException;

public class MemoryCacheImageOutputStream_1 {
    public static void main(String[] args) {
        try {
            MemoryCacheImageOutputStream outputStream = new MemoryCacheImageOutputStream();
            outputStream.write(65); // writes 'A' to the stream
            outputStream.write(66); // writes 'B' to the stream
            outputStream.write(67); // writes 'C' to the stream
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
