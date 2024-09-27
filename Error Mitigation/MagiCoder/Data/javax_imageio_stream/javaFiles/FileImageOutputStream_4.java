import javax.imageio.stream.FileImageOutputStream;
import java.io.File;
import java.io.IOException;

public class FileImageOutputStream_4 {
    public static void main(String[] args) {
        try {
            File file = new File("output.txt");
            FileImageOutputStream output = new FileImageOutputStream(file);
            output.write(65); // writes 'A' to the file
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
