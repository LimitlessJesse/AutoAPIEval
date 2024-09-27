import javax.activation.DataSource;
import javax.activation.FileDataSource;
import java.io.IOException;
import java.io.OutputStream;

public class FileDataSource_4 {
    public static void main(String[] args) {
        FileDataSource fileDataSource = new FileDataSource("example.txt");
        try {
            OutputStream outputStream = fileDataSource.getOutputStream();
            // Use the outputStream to write data to the file
            outputStream.write("Hello, World!".getBytes());
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
