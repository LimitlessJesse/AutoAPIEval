import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.io.IOException;

public class FileImageInputStream_4 {
    public static void main(String[] args) {
        try {
            File file = new File("example.jpg");
            FileImageInputStream imageInputStream = new FileImageInputStream(file);
            long position = 100; // desired file pointer position
            imageInputStream.seek(position);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
