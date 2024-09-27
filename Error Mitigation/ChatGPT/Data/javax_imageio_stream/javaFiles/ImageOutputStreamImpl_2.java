import javax.imageio.stream.ImageOutputStreamImpl;
import java.io.IOException;

public class ImageOutputStreamImpl_2 {
    public static void main(String[] args) {
        ImageOutputStreamImpl imageOutputStream = new ImageOutputStreamImpl(); // Instantiate ImageOutputStreamImpl
        byte[] bytes = {65, 66, 67}; // Sample byte array
        int offset = 0; // Start offset
        int length = 3; // Number of bytes to write
        
        try {
            imageOutputStream.write(bytes, offset, length); // Call the write method
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
