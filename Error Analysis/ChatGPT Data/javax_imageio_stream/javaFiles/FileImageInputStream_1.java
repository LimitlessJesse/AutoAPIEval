import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.io.IOException;

public class FileImageInputStream_1 {
    public static void main(String[] args) {
        try {
            FileImageInputStream imageInputStream = new FileImageInputStream(new File("image.jpg"));
            int value = imageInputStream.read();
            System.out.println("Read value: " + value);
            imageInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
