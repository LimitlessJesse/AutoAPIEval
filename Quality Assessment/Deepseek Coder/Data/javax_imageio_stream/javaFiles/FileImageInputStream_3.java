import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.io.IOException;

public class FileImageInputStream_3 {
    public static void main(String[] args) {
        try {
            FileImageInputStream inputStream = new FileImageInputStream(new File("path_to_your_file"));
            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            while ((bytesRead = inputStream.read(buffer, 0, buffer.length))!= -1) {
                // Process the read bytes
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
