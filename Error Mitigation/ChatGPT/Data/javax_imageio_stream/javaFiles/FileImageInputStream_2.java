import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.io.IOException;

public class FileImageInputStream_2 {
    public static void main(String[] args) {
        try {
            File file = new File("example.jpg");
            FileImageInputStream imageInputStream = new FileImageInputStream(file);
            byte[] buffer = new byte[1024];
            int bytesRead = imageInputStream.read(buffer, 0, buffer.length);
            System.out.println("Bytes read: " + bytesRead);
            imageInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
