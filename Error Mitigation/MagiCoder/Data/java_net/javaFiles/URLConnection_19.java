import java.net.URL;
import java.net.URLConnection;
import java.io.IOException;

public class URLConnection_19 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com");
            URLConnection urlConnection = url.openConnection();
            urlConnection.setConnectTimeout(5000); // Set connect timeout to 5 seconds
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
