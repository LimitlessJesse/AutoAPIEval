import javax.imageio.stream.ImageInputStreamImpl;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ImageInputStreamImpl_3 {
    public static void main(String[] args) {
        try {
            // Create a ByteArrayInputStream
            ByteArrayInputStream bis = new ByteArrayInputStream("Hello, World!".getBytes());

            // Create an ImageInputStreamImpl
            ImageInputStreamImpl iis = new ImageInputStreamImpl(bis);

            // Create a byte array
            byte[] b = new byte[1024];

            // Read data from the ImageInputStreamImpl
            int numRead = iis.read(b, 0, b.length);

            // Print the number of bytes read
            System.out.println("Number of bytes read: " + numRead);

            // Print the data read
            System.out.println("Data read: " + new String(b, 0, numRead));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
