import javax.imageio.stream.FileImageOutputStream;
import java.io.File;
import java.io.IOException;

public class FileImageOutputStream_8 {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            FileImageOutputStream output = new FileImageOutputStream(file);
            long length = output.length();
            System.out.println("Length of the file: " + length);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
