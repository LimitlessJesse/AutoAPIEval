import java.net.URI;

public class URI_3 {
    public static void main(String[] args) {
        try {
            URI uri = new URI("http://www.example.com:8080");
            int port = uri.getPort();
            System.out.println("Port number: " + port);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
