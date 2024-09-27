import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.activation.DataSource;
import javax.activation.URLDataSource;

public class URLDataSource_2 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.example.com");
            DataSource dataSource = new URLDataSource(url);
            InputStream inputStream = dataSource.getInputStream();
            // Now you can use the inputStream for reading data from the URL.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
