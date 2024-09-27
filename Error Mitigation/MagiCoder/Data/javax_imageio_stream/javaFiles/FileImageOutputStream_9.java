import javax.imageio.stream.FileImageOutputStream;
import java.io.File;
import java.io.IOException;

public class FileImageOutputStream_9 {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            FileImageOutputStream output = new FileImageOutputStream(file);
            output.seek(100); // Seek to position 100
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
