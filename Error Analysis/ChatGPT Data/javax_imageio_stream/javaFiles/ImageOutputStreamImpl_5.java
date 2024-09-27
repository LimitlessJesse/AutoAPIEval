import javax.imageio.stream.ImageOutputStreamImpl;
import java.io.IOException;

public class ImageOutputStreamImpl_5 {
    public static void main(String[] args) {
        ImageOutputStreamImpl stream = new ImageOutputStreamImpl();
        try {
            long bits = 1234567890L;
            int numBits = 32;
            stream.writeBits(bits, numBits);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
