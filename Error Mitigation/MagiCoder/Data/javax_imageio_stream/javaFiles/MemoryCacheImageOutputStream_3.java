import javax.imageio.stream.MemoryCacheImageOutputStream;
import java.io.IOException;

public class MemoryCacheImageOutputStream_3 {
    public static void main(String[] args) throws IOException {
        MemoryCacheImageOutputStream outputStream = new MemoryCacheImageOutputStream();
        byte[] bytes = {1, 2, 3, 4, 5};
        outputStream.write(bytes, 1, 3);
    }
}
