import javax.imageio.stream.FileImageOutputStream;
import java.io.File;
import java.io.IOException;

public class FileImageOutputStream_2 {
    public static void main(String[] args) {
        try {
            File file = new File("output.txt");
            FileImageOutputStream imageOutputStream = new FileImageOutputStream(file);
            byte[] data = {65, 66, 67}; // Sample byte array
            int offset = 0;
            int length = data.length;
            imageOutputStream.write(data, offset, length);
            imageOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
