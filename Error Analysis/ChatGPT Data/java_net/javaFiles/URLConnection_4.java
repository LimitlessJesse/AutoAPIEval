import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnection_4 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");
            URLConnection connection = url.openConnection();
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization", "Bearer token123");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
