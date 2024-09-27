import java.net.HttpURLConnection;
import java.net.ProtocolException;

public class HttpURLConnection_1 {
    public static void main(String[] args) {
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL("http://www.example.com").openConnection();
            connection.setRequestMethod("GET");
        } catch (ProtocolException e) {
            e.printStackTrace();
        }
    }
}
