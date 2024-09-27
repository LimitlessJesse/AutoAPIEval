import java.net.URL;
import java.net.URLConnection;
import java.io.IOException;

public class URLConnection_16 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com");
            URLConnection urlConnection = url.openConnection();
            urlConnection.setUseCaches(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
