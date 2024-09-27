import java.net.URI;

public class URI_5 {
    public static void main(String[] args) {
        URI uri = URI.create("https://www.example.com/path?key1=value1&key2=value2");
        String query = uri.getQuery();
        System.out.println("Query String: " + query);
    }
}
