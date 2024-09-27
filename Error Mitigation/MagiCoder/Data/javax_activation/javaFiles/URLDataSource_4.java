import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import javax.activation.DataSource;
import javax.activation.URLDataSource;

public class URLDataSource_4 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.example.com");
            URLDataSource urlDataSource = new URLDataSource(url);
            OutputStream outputStream = urlDataSource.getOutputStream();
            // Use the outputStream as needed...
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
