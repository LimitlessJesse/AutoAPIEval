import java.net.URI;

public class URI_5 {
    public static void main(String[] args) {
        try {
            URI uri = new URI("http://www.example.com/test?param1=value1&param2=value2");
            String query = uri.getQuery();
            System.out.println("Query: " + query);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
