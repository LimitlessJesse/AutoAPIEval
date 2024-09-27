import javax.activation.URLDataSource;
import java.net.URL;

public class URLDataSource_2 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com");
            URLDataSource dataSource = (URLDataSource) url.getContent();
            String contentType = dataSource.getContentType();
            System.out.println("Content Type: " + contentType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
