import java.net.URI;

public class URI_1 {
    public static void main(String[] args) {
        try {
            URI uri = new URI("https://www.example.com");
            String scheme = uri.getScheme();
            System.out.println("Scheme: " + scheme);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
