import javax.imageio.stream.ImageOutputStreamImpl;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ImageOutputStreamImpl_2 {
    public static void main(String[] args) {
        // Create a ByteArrayOutputStream
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // Create an ImageOutputStreamImpl from the ByteArrayOutputStream
        ImageOutputStreamImpl ios = new ImageOutputStreamImpl(baos);

        // Create a byte array
        byte[] b = {1, 2, 3, 4, 5};

        try {
            // Use the write(byte[] b) method
            ios.write(b);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print the contents of the ByteArrayOutputStream
        System.out.println(baos.toString());
    }
}
