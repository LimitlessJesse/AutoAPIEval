import javax.imageio.stream.FileCacheImageInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileCacheImageInputStream_4 {
    public static void main(String[] args) {
        File file = new File("image.jpg");
        try (FileInputStream fis = new FileInputStream(file);
             FileCacheImageInputStream cacheStream = new FileCacheImageInputStream(fis, null)) {

            boolean cached = cacheStream.isCached();
            System.out.println("Is Cached: " + cached);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
