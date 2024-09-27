import javax.activation.URLDataSource;
import java.net.URL;

public class URLDataSource_4 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");
            URLDataSource dataSource = new URLDataSource(url);
            System.out.println(dataSource.getURL());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
