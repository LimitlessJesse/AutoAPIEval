import javax.imageio.stream.ImageInputStream;
import java.io.IOException;

public class ImageInputStreamImpl_1 {
    public static void main(String[] args) throws IOException {
        ImageInputStream inputStream = new ImageInputStreamImpl();
        int byteValue = inputStream.read();
        System.out.println(byteValue);
    }
}
