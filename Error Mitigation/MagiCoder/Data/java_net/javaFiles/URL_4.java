import java.net.URL;

public class URL_4 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.example.com");
            String urlString = url.toString();
            System.out.println(urlString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
