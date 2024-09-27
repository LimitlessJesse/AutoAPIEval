import javax.imageio.stream.ImageInputStreamImpl;
import java.io.IOException;

public class ImageInputStreamImpl_3 {
    public static void main(String[] args) {
        ImageInputStreamImpl imageInputStream = new ImageInputStreamImpl();
        try {
            long value = imageInputStream.readLong();
            System.out.println("Read long value: " + value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
