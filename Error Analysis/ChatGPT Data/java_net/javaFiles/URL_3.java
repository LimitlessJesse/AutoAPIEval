import java.net.URL;
import java.net.URLConnection;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class URL_3 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");
            URLConnection connection = url.openConnection();
            connection.connect();
            
            InputStream is = connection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
