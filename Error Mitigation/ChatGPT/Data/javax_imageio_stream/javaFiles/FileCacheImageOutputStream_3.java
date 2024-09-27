import javax.imageio.stream.FileCacheImageOutputStream;
import java.io.IOException;

public class FileCacheImageOutputStream_3 {
    public static void main(String[] args) {
        FileCacheImageOutputStream output = null;
        try {
            output = new FileCacheImageOutputStream(new File("output.jpg"));
            output.flushBefore(100);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
