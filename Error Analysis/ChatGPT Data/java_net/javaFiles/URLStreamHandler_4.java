import java.net.URL;
import java.net.URLStreamHandler;

public class URLStreamHandler_4 {
    public static void main(String[] args) {
        URLStreamHandler handler = new URLStreamHandler() {
            protected void setURL(URL u, String protocol, String host, int port, String file, String ref) {
                u.set(u, protocol, host, port, file, ref);
            }
        };
    }
}
