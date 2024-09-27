import java.io.IOException;
import java.net.ContentHandler;
import java.net.URL;
import java.net.URLConnection;

public class ContentHandler_3 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com");
            URLConnection urlConnection = url.openConnection();
            ContentHandler contentHandler = new ContentHandler();
            Object content = contentHandler.getContent(urlConnection);
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
