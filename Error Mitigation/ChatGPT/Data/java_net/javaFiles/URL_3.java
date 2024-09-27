import java.net.URL;

public class URL_3 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com:8080");
            int port = url.getPort();
            System.out.println("Port number: " + port);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
