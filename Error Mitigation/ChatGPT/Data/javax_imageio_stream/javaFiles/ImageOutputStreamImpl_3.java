import javax.imageio.stream.ImageOutputStreamImpl;
import java.io.IOException;

public class ImageOutputStreamImpl_3 {
    public static void main(String[] args) {
        ImageOutputStreamImpl imageOutputStream = new ImageOutputStreamImpl(); // Instantiate ImageOutputStreamImpl
        boolean value = true; // Boolean value to be written
        try {
            imageOutputStream.writeBoolean(value); // Write boolean value to the stream
        } catch (IOException e) {
            e.printStackTrace(); // Handle IOException
        }
    }
}
