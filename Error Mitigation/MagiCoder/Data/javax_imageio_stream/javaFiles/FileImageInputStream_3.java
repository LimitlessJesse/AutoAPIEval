import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.io.IOException;

public class FileImageInputStream_3 {
    public static void main(String[] args) {
        try {
            File file = new File("path_to_your_file");
            FileImageInputStream stream = new FileImageInputStream(file);
            byte[] buffer = new byte[1024];
            int bytesRead = stream.read(buffer, 0, buffer.length);
            while (bytesRead!= -1) {
                // process the bytes
                bytesRead = stream.read(buffer, 0, buffer.length);
            }
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
