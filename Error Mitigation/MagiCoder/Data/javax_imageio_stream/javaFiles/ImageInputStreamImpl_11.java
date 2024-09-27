import javax.imageio.stream.ImageInputStream;
import java.io.IOException;

public class ImageInputStreamImpl_11 {
    public static void main(String[] args) {
        ImageInputStreamImpl imageInputStream = new ImageInputStreamImpl();
        try {
            imageInputStream.seek(100);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
