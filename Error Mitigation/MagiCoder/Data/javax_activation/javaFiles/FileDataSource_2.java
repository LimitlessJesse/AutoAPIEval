import javax.activation.DataSource;
import javax.activation.FileDataSource;
import java.io.IOException;
import java.io.InputStream;

public class FileDataSource_2 {
    public static void main(String[] args) {
        try {
            DataSource dataSource = new FileDataSource("path_to_your_file");
            InputStream inputStream = dataSource.getInputStream();
            // Now you can use inputStream for reading the file data.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
