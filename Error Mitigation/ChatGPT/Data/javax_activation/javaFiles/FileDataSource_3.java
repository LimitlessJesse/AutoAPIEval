import javax.activation.DataSource;
import javax.activation.FileDataSource;
import java.io.IOException;
import java.io.InputStream;

public class FileDataSource_3 {
    public static void main(String[] args) {
        FileDataSource fileDataSource = new FileDataSource("example.txt");
        try {
            InputStream inputStream = fileDataSource.getInputStream();
            // Use the inputStream here
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
