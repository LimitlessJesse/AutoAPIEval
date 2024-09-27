import javax.imageio.stream.ImageOutputStreamImpl;
import java.io.IOException;

public class ImageOutputStreamImpl_5 {
    public static void main(String[] args) {
        ImageOutputStreamImpl imageOutputStream = new ImageOutputStreamImpl(); // Instantiate ImageOutputStreamImpl
        int value = 123456789; // Integer value to write
        
        try {
            imageOutputStream.writeInt(value); // Write integer value to the stream
            System.out.println("Integer value has been written to the stream.");
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
