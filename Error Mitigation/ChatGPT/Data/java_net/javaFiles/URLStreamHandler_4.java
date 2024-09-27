import java.net.URL;
import java.net.URLStreamHandler;

public class URLStreamHandler_4 {
    public static void main(String[] args) {
        URL url1 = new URL("http://www.example.com");
        URL url2 = new URL("http://www.example.com");
        
        URLStreamHandler handler = url1.getURLStreamHandler();
        boolean areEqual = handler.equals(url1, url2);
        
        System.out.println("Are the URLs equal? " + areEqual);
    }
}
