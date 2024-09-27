import javax.imageio.stream.ImageOutputStreamImpl;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ImageOutputStreamImpl_1 {
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageOutputStreamImpl ios = new ImageOutputStreamImpl(baos);

        try {
            ios.write(65); // ASCII value of 'A'
            ios.write(66); // ASCII value of 'B'
            ios.write(67); // ASCII value of 'C'

            byte[] bytes = baos.toByteArray();
            for (byte b : bytes) {
                System.out.println((char) b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
