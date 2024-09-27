import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnection_10 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setChunkedStreamingMode(0);
            conn.connect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
