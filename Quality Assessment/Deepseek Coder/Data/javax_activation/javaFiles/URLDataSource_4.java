import javax.activation.URLDataSource;
import java.net.URL;

public class URLDataSource_4 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com");
            URLDataSource dataSource = (URLDataSource) url.getContent();
            String name = dataSource.getName();
            System.out.println("Name: " + name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
