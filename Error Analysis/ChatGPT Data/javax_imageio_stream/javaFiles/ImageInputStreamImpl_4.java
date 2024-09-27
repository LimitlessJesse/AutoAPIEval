import javax.imageio.stream.ImageInputStreamImpl;
import java.io.File;
import java.io.IOException;

public class ImageInputStreamImpl_4 {
    public static void main(String[] args) {
        try {
            ImageInputStreamImpl imageInputStream = new ImageInputStreamImpl(new File("image.jpg"));
            int unsignedShort = imageInputStream.readUnsignedShort();
            System.out.println("Unsigned Short Value: " + unsignedShort);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
