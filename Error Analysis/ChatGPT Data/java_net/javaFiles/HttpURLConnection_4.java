import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;

public class HttpURLConnection_4 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            System.out.println("Request method set to: " + connection.getRequestMethod());
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
