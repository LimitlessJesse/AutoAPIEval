import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class URL_4 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");
            URLConnection urlConnection = url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            
            String inputLine;
            while ((inputLine = bufferedReader.readLine())!= null) {
                System.out.println(inputLine);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
