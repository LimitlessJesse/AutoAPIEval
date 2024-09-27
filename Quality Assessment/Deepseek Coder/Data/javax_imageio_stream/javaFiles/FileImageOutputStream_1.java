import javax.imageio.stream.FileImageOutputStream;
import java.io.File;
import java.io.IOException;

public class FileImageOutputStream_1 {
    public static void main(String[] args) {
        try {
            FileImageOutputStream output = new FileImageOutputStream(new File("output.txt"));
            output.write(65); // ASCII value of 'A'
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
