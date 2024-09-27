import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.io.IOException;

public class FileImageInputStream_1 {
    public static void main(String[] args) {
        try {
            File file = new File("example.jpg");
            FileImageInputStream imageInputStream = new FileImageInputStream(file);
            int byteValue = imageInputStream.read();
            System.out.println("Byte value read: " + byteValue);
            imageInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
