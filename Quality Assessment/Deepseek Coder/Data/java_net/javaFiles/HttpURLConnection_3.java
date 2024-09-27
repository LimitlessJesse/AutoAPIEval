import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnection_3 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com");
            HttpURLConnection http = (HttpURLConnection)url.openConnection();
            http.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
