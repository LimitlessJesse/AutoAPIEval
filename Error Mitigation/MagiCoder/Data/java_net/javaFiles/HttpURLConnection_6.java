import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnection_6 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com/nonexistent");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            InputStream errorStream = connection.getErrorStream();
            if (errorStream!= null) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(errorStream));
                String line;
                while ((line = reader.readLine())!= null) {
                    System.out.println(line);
                }
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
