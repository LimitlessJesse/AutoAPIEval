import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnection_9 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setFixedLengthStreamingMode(1024);

            OutputStream os = conn.getOutputStream();
            os.write("Hello, World!".getBytes());
            os.flush();

            if (conn.getResponseCode()!= HttpURLConnection.HTTP_CREATED) {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }

            conn.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
