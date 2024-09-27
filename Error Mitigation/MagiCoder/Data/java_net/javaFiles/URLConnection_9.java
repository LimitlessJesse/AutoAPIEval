import java.net.URL;
import java.net.URLConnection;
import java.io.IOException;

public class URLConnection_9 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com");
            URLConnection urlConnection = url.openConnection();
            String contentEncoding = urlConnection.getContentEncoding();
            System.out.println("Content Encoding: " + contentEncoding);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
