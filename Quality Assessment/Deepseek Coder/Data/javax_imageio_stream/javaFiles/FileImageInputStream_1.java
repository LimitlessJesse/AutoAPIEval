import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.io.IOException;

public class FileImageInputStream_1 {
    public static void main(String[] args) {
        try {
            FileImageInputStream input = new FileImageInputStream(new File("path_to_your_file"));
            int data;
            while ((data = input.read())!= -1) {
                System.out.println(data);
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
