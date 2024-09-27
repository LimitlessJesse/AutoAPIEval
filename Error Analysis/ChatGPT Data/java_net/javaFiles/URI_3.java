import java.net.URI;

public class URI_3 {
    public static void main(String[] args) {
        try {
            URI uri = new URI("https://www.example.com:8080/test");
            int port = uri.getPort();  // This will return 8080
            System.out.println("Port: " + port);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
