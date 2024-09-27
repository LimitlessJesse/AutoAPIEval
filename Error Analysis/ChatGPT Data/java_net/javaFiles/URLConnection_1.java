import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnection_1 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");
            URLConnection urlConnection = url.openConnection();
            urlConnection.connect();
            
            System.out.println("Connection established successfully");
        } catch (IOException e) {
            System.out.println("Error connecting to URL: " + e.getMessage());
        }
    }
}
