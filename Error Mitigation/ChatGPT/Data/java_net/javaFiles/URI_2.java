import java.net.URI;

public class URI_2 {
    public static void main(String[] args) {
        try {
            URI uri = new URI("https://www.example.com");
            String host = uri.getHost();
            System.out.println("Host: " + host);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
