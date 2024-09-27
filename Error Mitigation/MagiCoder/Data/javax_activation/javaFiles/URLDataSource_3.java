import java.net.MalformedURLException;
import java.net.URL;
import javax.activation.DataSource;
import javax.activation.URLDataSource;

public class URLDataSource_3 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com");
            DataSource dataSource = new URLDataSource(url);
            String name = dataSource.getName();
            System.out.println("Name: " + name);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
