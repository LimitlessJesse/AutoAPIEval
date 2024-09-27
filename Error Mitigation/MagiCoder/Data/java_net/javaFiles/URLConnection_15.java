import java.net.URL;
import java.net.URLConnection;
import java.io.IOException;

public class URLConnection_15 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com");
            URLConnection urlConnection = url.openConnection();
            urlConnection.setDoOutput(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
