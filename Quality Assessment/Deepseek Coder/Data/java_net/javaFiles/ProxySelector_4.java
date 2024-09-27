import java.net.ProxySelector;
import java.net.Proxy;
import java.net.InetSocketAddress;
import java.io.IOException;

public class ProxySelector_4 {
    public static void main(String[] args) {
        // Create a ProxySelector
        ProxySelector selector = ProxySelector.of(new InetSocketAddress("proxy.example.com", 8080));

        // Set the default ProxySelector
        ProxySelector.setDefault(selector);

        // Now, any network operations will use this ProxySelector
        // For example, a URLConnection
        try {
            URL url = new URL("http://example.com");
            URLConnection connection = url.openConnection();
            // The connection will use the ProxySelector to determine the Proxy to use
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
