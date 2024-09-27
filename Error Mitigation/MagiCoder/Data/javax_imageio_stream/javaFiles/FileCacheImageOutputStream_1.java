import javax.imageio.stream.FileCacheImageOutputStream;
import java.io.IOException;

public class FileCacheImageOutputStream_1 {
    public static void main(String[] args) {
        try {
            FileCacheImageOutputStream fcio = new FileCacheImageOutputStream("path_to_file");
            // Perform operations on fcio
            fcio.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
