import javax.imageio.stream.MemoryCacheImageOutputStream;
import java.io.IOException;

public class MemoryCacheImageOutputStream_5 {
    public static void main(String[] args) {
        MemoryCacheImageOutputStream outputStream = new MemoryCacheImageOutputStream();
        try {
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
