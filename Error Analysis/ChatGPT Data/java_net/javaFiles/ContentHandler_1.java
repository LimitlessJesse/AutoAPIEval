import java.net.ContentHandler;
import java.net.URLConnection;
import java.io.IOException;

public class ContentHandler_1 {
    public static void main(String[] args) {
        URLConnection urlConnection = null; // initialize URLConnection object
        try {
            ContentHandler contentHandler = urlConnection.getContent(); // get content using getContent method
            System.out.println("Content: " + contentHandler); // print the content
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
