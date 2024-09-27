import java.net.URLStreamHandler;

public class URLStreamHandler_3 {
    public static void main(String[] args) {
        URLStreamHandler handler = new URLStreamHandler() {
            @Override
            protected int getDefaultPort() {
                return 80; // Default port for HTTP
            }
        };

        int defaultPort = handler.getDefaultPort();
        System.out.println("Default port: " + defaultPort);
    }
}
