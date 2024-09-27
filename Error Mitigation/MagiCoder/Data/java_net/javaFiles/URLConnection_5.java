import java.net.URL;
import java.net.URLConnection;
import java.io.IOException;

public class URLConnection_5 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com");
            URLConnection connection = url.openConnection();
            connection.setRequestProperty("User-Agent", "Mozilla/5.0");
            connection.connect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
