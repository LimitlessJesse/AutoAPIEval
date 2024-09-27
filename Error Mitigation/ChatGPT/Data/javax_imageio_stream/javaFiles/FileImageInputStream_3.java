import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.io.IOException;

public class FileImageInputStream_3 {
    public static void main(String[] args) {
        File file = new File("example.jpg");
        try {
            FileImageInputStream imageInputStream = new FileImageInputStream(file);
            long fileLength = imageInputStream.length();
            System.out.println("File length: " + fileLength);
            imageInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
