import javax.imageio.stream.ImageOutputStreamImpl;
import java.io.IOException;

public class ImageOutputStreamImpl_1 {
    public static void main(String[] args) {
        ImageOutputStreamImpl imageOutputStream = new ImageOutputStreamImpl(); // Instantiate ImageOutputStreamImpl
        int byteToWrite = 65; // ASCII value of 'A'
        
        try {
            imageOutputStream.write(byteToWrite); // Write the byte to the stream
            System.out.println("Byte " + byteToWrite + " has been written to the stream.");
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
