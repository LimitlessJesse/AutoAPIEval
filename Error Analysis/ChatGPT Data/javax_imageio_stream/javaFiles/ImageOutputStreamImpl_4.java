import javax.imageio.stream.ImageOutputStreamImpl;
import java.io.IOException;

public class ImageOutputStreamImpl_4 {
    public static void main(String[] args) {
        ImageOutputStreamImpl outputStream = new ImageOutputStreamImpl();
        byte[] data = { 65, 66, 67, 68, 69 }; // Sample byte array
        int off = 1; // Offset position
        int len = 3; // Length of bytes to write
        
        try {
            outputStream.write(data, off, len);
            System.out.println("Bytes were successfully written.");
        } catch (IOException e) {
            System.err.println("Error writing bytes: " + e.getMessage());
        }
    }
}
