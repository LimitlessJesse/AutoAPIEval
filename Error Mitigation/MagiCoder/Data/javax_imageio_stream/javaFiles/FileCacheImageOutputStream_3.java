import javax.imageio.stream.FileCacheImageOutputStream;
import java.io.File;
import java.io.IOException;

public class FileCacheImageOutputStream_3 {
    public static void main(String[] args) {
        try {
            FileCacheImageOutputStream fos = new FileCacheImageOutputStream(new File("output.txt"));
            fos.write(65); // writes 'A' to the file
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
