import javax.imageio.stream.FileImageOutputStream;
import java.io.File;
import java.io.IOException;

public class FileImageOutputStream_7 {
    public static void main(String[] args) {
        try {
            File file = new File("image.jpg");
            FileImageOutputStream output = new FileImageOutputStream(file);
            //...
            // Your code here
            //...
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
