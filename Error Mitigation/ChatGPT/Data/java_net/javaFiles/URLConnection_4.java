import java.net.URL;
import java.net.URLConnection;

public class URLConnection_4 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");
            URLConnection connection = url.openConnection();
            int contentLength = connection.getContentLength();
            System.out.println("Content Length: " + contentLength);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
