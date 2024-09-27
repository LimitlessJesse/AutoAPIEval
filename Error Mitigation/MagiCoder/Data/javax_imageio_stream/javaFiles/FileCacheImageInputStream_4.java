import javax.imageio.stream.ImageInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileCacheImageInputStream_4 {
    public static void main(String[] args) {
        try {
            File file = new File("path_to_your_file");
            FileInputStream fis = new FileInputStream(file);
            ImageInputStream iis = new FileCacheImageInputStream(fis);

            int data = iis.read();
            System.out.println(data);

            iis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
