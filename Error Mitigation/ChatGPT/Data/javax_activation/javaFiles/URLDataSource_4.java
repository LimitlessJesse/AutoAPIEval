import javax.activation.URLDataSource;
import java.net.URL;

public class URLDataSource_4 {
    public static void main(String[] args) {
        URLDataSource dataSource = new URLDataSource(new URL("https://www.example.com"));
        URL url = dataSource.getURL();
        System.out.println("URL: " + url);
    }
}
