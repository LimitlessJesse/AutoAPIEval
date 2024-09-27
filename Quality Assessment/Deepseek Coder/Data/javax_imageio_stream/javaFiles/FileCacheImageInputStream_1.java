import javax.imageio.stream.FileCacheImageInputStream;
import java.io.File;
import java.io.IOException;

public class FileCacheImageInputStream_1 {
    public static void main(String[] args) {
        try {
            File file = new File("path_to_your_file");
            FileCacheImageInputStream fis = new FileCacheImageInputStream(file);
            int data;
            while ((data = fis.read())!= -1) {
                System.out.print((char) data);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
