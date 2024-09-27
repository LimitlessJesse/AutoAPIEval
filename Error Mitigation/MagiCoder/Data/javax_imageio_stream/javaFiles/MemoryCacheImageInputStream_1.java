import javax.imageio.stream.ImageInputStream;
import java.io.IOException;

public class MemoryCacheImageInputStream_1 {
    public static void main(String[] args) {
        ImageInputStream inputStream = new MemoryCacheImageInputStream();
        try {
            int byteValue = inputStream.read();
            System.out.println(byteValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
