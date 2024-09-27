import java.net.*;
import java.io.*;

public class ContentHandler_1 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com");
            URLConnection urlc = url.openConnection();
            ContentHandler handler = new ContentHandler() {
                @Override
                public Object getContent(URLConnection urlc) throws IOException {
                    try (InputStream is = urlc.getInputStream()) {
                        return is.read();
                    }
                }
            };
            Object content = handler.getContent(urlc);
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
