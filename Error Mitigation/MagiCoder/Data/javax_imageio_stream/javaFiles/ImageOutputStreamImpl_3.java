import javax.imageio.stream.ImageOutputStreamImpl;
import java.io.IOException;

public class ImageOutputStreamImpl_3 {
    public static void main(String[] args) {
        ImageOutputStreamImpl imageOutputStream = new ImageOutputStreamImpl();
        try {
            imageOutputStream.write(123);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
