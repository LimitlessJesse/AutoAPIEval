import javax.activation.FileDataSource;
import java.io.IOException;
import java.io.OutputStream;

public class FileDataSource_4 {
    public static void main(String[] args) {
        try {
            FileDataSource fileDataSource = new FileDataSource("example.txt");
            OutputStream outputStream = fileDataSource.getOutputStream();
            String text = "Hello, World!";
            byte[] bytes = text.getBytes();
            outputStream.write(bytes);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
