import javax.imageio.stream.ImageOutputStreamImpl;
import java.io.IOException;

public class ImageOutputStreamImpl_3 {
    public static void main(String[] args) {
        ImageOutputStreamImpl outputStream = new ImageOutputStreamImpl();
        try {
            outputStream.write(65); // Writing byte value 65
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
