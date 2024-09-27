import java.net.URL;

public class URL_5 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");
            int hashCode = url.hashCode();
            System.out.println("Hash code of the URL: " + hashCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
