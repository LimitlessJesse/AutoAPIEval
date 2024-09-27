import javax.imageio.stream.FileCacheImageOutputStream;
import java.io.File;
import java.io.IOException;

public class FileCacheImageOutputStream_1 {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            FileCacheImageOutputStream outputStream = new FileCacheImageOutputStream(file);
            // Write something to the output stream
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
