import javax.activation.DataSource;
import javax.activation.URLDataSource;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class URLDataSource_1 {
    public static void main(String[] args) {
        URL url = new URL("https://www.example.com");
        DataSource dataSource = new URLDataSource(url);
        
        try {
            InputStream inputStream = dataSource.getInputStream();
            // Use the inputStream here
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
