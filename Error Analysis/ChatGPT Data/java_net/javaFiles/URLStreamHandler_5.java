import java.net.URL;
import java.net.URLStreamHandler;

public class URLStreamHandler_5 {
    
    public static void main(String[] args) {
        URLStreamHandler handler = new URLStreamHandler() {
            @Override
            protected URLConnection openConnection(URL u) {
                return null;
            }
        };

        URL url = new URL("http://www.example.com", null, handler);
        
        String externalForm = url.toExternalForm();
        System.out.println("External form of URL: " + externalForm);
    }
}
