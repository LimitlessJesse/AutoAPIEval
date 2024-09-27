import java.net.ProxySelector;
import java.net.URI;
import java.net.SocketAddress;
import java.io.IOException;

public class ProxySelector_2 {
    public static void main(String[] args) {
        ProxySelector selector = ProxySelector.getDefault();
        
        selector.connectFailed(new URI("http://example.com"), null, new IOException("Connection failed"));
    }
}
