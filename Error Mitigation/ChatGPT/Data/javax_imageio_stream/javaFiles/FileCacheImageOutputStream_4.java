import javax.imageio.stream.FileCacheImageOutputStream;
import java.io.IOException;

public class FileCacheImageOutputStream_4 {
    public static void main(String[] args) {
        FileCacheImageOutputStream output = null;
        try {
            output = new FileCacheImageOutputStream(new File("output.jpg"));
            byte[] data = {65, 66, 67, 68, 69}; // Sample data to write
            int offset = 0;
            int length = data.length;
            output.write(data, offset, length);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (output != null) {
                    output.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
