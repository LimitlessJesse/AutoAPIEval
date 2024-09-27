import javax.imageio.stream.FileCacheImageOutputStream;
import java.io.File;
import java.io.IOException;

public class FileCacheImageOutputStream_3 {
    public static void main(String[] args) {
        try {
            File file = new File("path_to_your_file");
            FileCacheImageOutputStream outputStream = new FileCacheImageOutputStream(file);
            int data = outputStream.read();
            if (data!= -1) {
                System.out.println("Read byte: " + data);
            } else {
                System.out.println("End of stream reached");
            }
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
