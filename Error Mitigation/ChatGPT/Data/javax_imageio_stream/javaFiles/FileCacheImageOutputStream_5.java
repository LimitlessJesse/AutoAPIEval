import javax.imageio.stream.FileCacheImageOutputStream;
import java.io.IOException;

public class FileCacheImageOutputStream_5 {
    public static void main(String[] args) {
        try {
            FileCacheImageOutputStream output = new FileCacheImageOutputStream(new File("output.jpg"));
            output.write(65); // Writes the byte value 65 to the output stream
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
