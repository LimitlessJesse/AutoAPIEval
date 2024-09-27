import javax.activation.DataSource;
import javax.activation.FileDataSource;
import java.io.IOException;
import java.io.OutputStream;

public class FileDataSource_3 {
    public static void main(String[] args) {
        try {
            DataSource dataSource = new FileDataSource("path_to_your_file");
            OutputStream outputStream = dataSource.getOutputStream();
            // Now you can write to the outputStream
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
