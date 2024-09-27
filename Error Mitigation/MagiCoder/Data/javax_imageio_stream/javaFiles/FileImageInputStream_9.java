import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.io.IOException;

public class FileImageInputStream_9 {
    public static void main(String[] args) {
        try {
            File file = new File("path_to_your_file");
            FileImageInputStream stream = new FileImageInputStream(file);
            // do something with the stream
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
