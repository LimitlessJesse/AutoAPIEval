import javax.imageio.stream.ImageInputStreamImpl;
import java.io.IOException;

public class ImageInputStreamImpl_2 {
    public static void main(String[] args) {
        ImageInputStreamImpl imageInputStream = new ImageInputStreamImpl();
        byte[] byteArray = new byte[10];
        try {
            int bytesRead = imageInputStream.read(byteArray);
            System.out.println("Number of bytes read: " + bytesRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
