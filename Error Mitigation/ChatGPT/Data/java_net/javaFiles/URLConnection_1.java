import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnection_1 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");
            URLConnection connection = url.openConnection();
            connection.connect();
            System.out.println("Connection established successfully");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
