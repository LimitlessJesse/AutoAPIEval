import java.net.URL;

public class URL_4 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");
            String protocol = url.getProtocol();
            System.out.println("Protocol: " + protocol);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
