import javax.imageio.stream.FileCacheImageInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileCacheImageInputStream_4 {
    public static void main(String[] args) {
        try {
            File file = new File("example.jpg");
            FileInputStream fis = new FileInputStream(file);
            FileCacheImageInputStream imageInputStream = new FileCacheImageInputStream(fis);

            byte[] buffer = new byte[1024];
            int bytesRead = imageInputStream.read(buffer, 0, buffer.length);

            System.out.println("Bytes read: " + bytesRead);

            imageInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
