import javax.imageio.stream.FileImageOutputStream;
import java.io.File;
import java.io.IOException;

public class FileImageOutputStream_3 {
    public static void main(String[] args) {
        try {
            File file = new File("example.jpg");
            FileImageOutputStream output = new FileImageOutputStream(file);

            byte[] data = new byte[100];
            for (int i = 0; i < data.length; i++) {
                data[i] = (byte) i;
            }

            output.write(data, 0, data.length);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
