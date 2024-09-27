import java.net.URL;
import java.net.URLConnection;

public class URLConnection_5 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");
            URLConnection connection = url.openConnection();
            String contentType = connection.getContentType();
            System.out.println("Content Type: " + contentType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
