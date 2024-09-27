import javax.imageio.stream.FileCacheImageOutputStream;
import java.io.File;
import java.io.IOException;

public class FileCacheImageOutputStream_5 {
    public static void main(String[] args) {
        try {
            FileCacheImageOutputStream fos = new FileCacheImageOutputStream(new File("output.txt"));
            byte[] bytes = "Hello, World!".getBytes();
            fos.write(bytes, 0, bytes.length);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
