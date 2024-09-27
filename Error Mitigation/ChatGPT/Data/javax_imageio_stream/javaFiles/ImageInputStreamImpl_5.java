import javax.imageio.stream.ImageInputStreamImpl;
import java.io.IOException;

public class ImageInputStreamImpl_5 {
    public static void main(String[] args) {
        ImageInputStreamImpl imageInputStream = new ImageInputStreamImpl();
        try {
            imageInputStream.seek(100L);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
