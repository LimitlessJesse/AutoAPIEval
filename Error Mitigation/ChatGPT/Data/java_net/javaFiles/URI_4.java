import java.net.URI;

public class URI_4 {
    public static void main(String[] args) {
        try {
            URI uri = new URI("https://www.example.com/path/to/resource");
            String path = uri.getPath();
            System.out.println("Decoded Path: " + path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
