import java.net.URL;
import java.net.URLConnection;
import java.io.IOException;

public class URLConnection_2 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.example.com");
            URLConnection conn = url.openConnection();
            conn.connect();
            System.out.println("Connection established!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
