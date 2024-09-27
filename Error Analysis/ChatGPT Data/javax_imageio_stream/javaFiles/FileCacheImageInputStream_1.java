import javax.imageio.stream.FileCacheImageInputStream;
import java.io.File;
import java.io.IOException;

public class FileCacheImageInputStream_1 {
    public static void main(String[] args) {
        File file = new File("image.jpg");
        try (FileCacheImageInputStream input = new FileCacheImageInputStream(file)) {
            int data;
            while ((data = input.read()) != -1) {
                System.out.print(data + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
