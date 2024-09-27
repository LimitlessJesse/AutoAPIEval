import javax.imageio.stream.ImageOutputStreamImpl;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ImageOutputStreamImpl_3 {
    public static void main(String[] args) {
        // Create a ByteArrayOutputStream
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // Create an ImageOutputStreamImpl from the ByteArrayOutputStream
        ImageOutputStreamImpl ios = new ImageOutputStreamImpl(baos);

        // Create a byte array
        byte[] b = {1, 2, 3, 4, 5};

        try {
            // Use the write method
            ios.write(b, 1, 3); // writes the bytes at offset 1 and length 3

            // Print the written bytes
            System.out.println(baos.toByteArray()); // prints [0, 2, 3]
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
