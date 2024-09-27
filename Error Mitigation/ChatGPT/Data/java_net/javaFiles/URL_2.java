import java.net.URL;

public class URL_2 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");
            String host = url.getHost();
            System.out.println("Host name: " + host);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
