import javax.activation.URLDataSource;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class URLDataSource_1 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.example.com/sample.txt");
            URLDataSource dataSource = new URLDataSource(url);
            InputStream inputStream = dataSource.getInputStream();
            
            // Read from inputStream or perform operations
            
            inputStream.close(); // Don't forget to close the InputStream
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
