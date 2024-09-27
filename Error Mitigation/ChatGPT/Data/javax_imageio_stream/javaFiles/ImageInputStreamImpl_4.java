import javax.imageio.stream.ImageInputStreamImpl;
import java.io.IOException;

public class ImageInputStreamImpl_4 {
    public static void main(String[] args) {
        ImageInputStreamImpl imageInputStream = new ImageInputStreamImpl();
        
        try {
            float floatValue = imageInputStream.readFloat();
            System.out.println("Float value read from stream: " + floatValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
