import javax.imageio.stream.FileCacheImageInputStream;
import java.io.File;
import java.io.IOException;

public class FileCacheImageInputStream_3 {
    public static void main(String[] args) {
        try {
            FileCacheImageInputStream stream = new FileCacheImageInputStream(new File("image.jpg"));
            byte[] data = new byte[10];
            int bytesRead = stream.read(data, 0, data.length);
            System.out.println("Bytes read: " + bytesRead);
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
