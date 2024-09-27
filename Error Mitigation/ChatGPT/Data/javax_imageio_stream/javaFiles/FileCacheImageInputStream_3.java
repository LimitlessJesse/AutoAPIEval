import javax.imageio.stream.FileCacheImageInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileCacheImageInputStream_3 {
    public static void main(String[] args) {
        try {
            File file = new File("example.jpg");
            FileInputStream fis = new FileInputStream(file);
            FileCacheImageInputStream imageInputStream = new FileCacheImageInputStream(fis);

            int byteValue = imageInputStream.read();
            System.out.println("Byte value read: " + byteValue);

            imageInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
