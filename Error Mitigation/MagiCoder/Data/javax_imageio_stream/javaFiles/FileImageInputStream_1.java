import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.io.IOException;

public class FileImageInputStream_1 {
    public static void main(String[] args) {
        try {
            File file = new File("path_to_your_file");
            FileImageInputStream stream = new FileImageInputStream(file);
            int byteRead = stream.read();
            System.out.println(byteRead);
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
