import javax.imageio.stream.FileCacheImageInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileCacheImageInputStream_9 {
    public static void main(String[] args) {
        try {
            File file = new File("path_to_your_file");
            FileInputStream fis = new FileInputStream(file);
            FileCacheImageInputStream fcis = new FileCacheImageInputStream(fis);

            // Your code here...

            fcis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
