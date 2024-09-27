import java.net.*;
import java.io.*;

public class ContentHandler_2 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com");
            URLConnection urlc = url.openConnection();
            ContentHandler handler = new ContentHandler() {
                @Override
                public Object getContent(URLConnection urlc, Class[] classes) throws IOException {
                    // Your implementation here
                    return null;
                }
            };
            Object obj = handler.getContent(urlc, new Class[]{String.class});
            if (obj instanceof String) {
                System.out.println((String) obj);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
