import javax.imageio.stream.MemoryCacheImageOutputStream;
import java.io.IOException;

public class MemoryCacheImageOutputStream_5 {
    public static void main(String[] args) {
        try {
            MemoryCacheImageOutputStream outputStream = new MemoryCacheImageOutputStream();
            // Perform some operations with the output stream
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
