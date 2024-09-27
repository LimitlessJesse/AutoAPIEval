import java.net.MalformedURLException;
import java.net.URL;

public class URL_5 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com/index.html");
            String fileName = url.getFile();
            System.out.println("File Name: " + fileName);
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL");
        }
    }
}
