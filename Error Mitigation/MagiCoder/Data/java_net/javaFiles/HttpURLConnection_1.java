import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;

public class HttpURLConnection_1 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            // Use the connection...

            // Disconnect when you're done.
            conn.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
