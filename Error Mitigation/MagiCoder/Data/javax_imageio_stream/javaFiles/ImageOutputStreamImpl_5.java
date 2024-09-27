import javax.imageio.stream.ImageOutputStreamImpl;
import java.io.IOException;

public class ImageOutputStreamImpl_5 {
    public static void main(String[] args) {
        ImageOutputStreamImpl imageOutputStream = new ImageOutputStreamImpl();
        try {
            byte[] bytes = {1, 2, 3, 4, 5};
            imageOutputStream.write(bytes, 0, bytes.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
