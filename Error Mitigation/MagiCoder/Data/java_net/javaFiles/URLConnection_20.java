import java.net.URL;
import java.net.URLConnection;
import java.io.IOException;

public class URLConnection_20 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com");
            URLConnection conn = url.openConnection();
            conn.setReadTimeout(5000); // Set read timeout to 5 seconds
            System.out.println("Read timeout set to: " + conn.getReadTimeout());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
