import javax.imageio.stream.MemoryCacheImageOutputStream;
import java.io.IOException;

public class MemoryCacheImageOutputStream_3 {
    public static void main(String[] args) {
        try {
            MemoryCacheImageOutputStream outputStream = new MemoryCacheImageOutputStream();
            byte[] bytes = new byte[]{1, 2, 3, 4, 5};
            outputStream.write(bytes, 1, 3); // writes the bytes 2, 3, 4
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
