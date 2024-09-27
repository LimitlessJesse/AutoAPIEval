import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public class HttpsURLConnection_3 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            connection.connect();
            String cipherSuite = connection.getCipherSuite();
            System.out.println("Cipher Suite: " + cipherSuite);
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
