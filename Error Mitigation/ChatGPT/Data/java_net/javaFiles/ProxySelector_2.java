import java.io.IOException;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;

public class ProxySelector_2 {
    public static void main(String[] args) {
        ProxySelector proxySelector = ProxySelector.getDefault();
        URI uri = URI.create("http://example.com");
        SocketAddress sa = new SocketAddress() {
            @Override
            public String toString() {
                return "ProxyServerAddress";
            }
        };
        IOException ioe = new IOException("Connection failed");

        proxySelector.connectFailed(uri, sa, ioe);
    }
}
