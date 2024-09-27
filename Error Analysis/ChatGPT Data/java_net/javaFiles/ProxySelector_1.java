import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.InetSocketAddress;
import java.util.List;

public class ProxySelector_1 {
    public static void main(String[] args) {
        // Create a URI object
        URI uri = URI.create("http://example.com");

        // Create a ProxySelector object
        ProxySelector selector = ProxySelector.getDefault();

        // Call select method to get a list of proxies for the specified URI
        List<Proxy> proxies = selector.select(uri);

        // Display the list of proxies
        System.out.println("List of proxies for URI " + uri + ":");
        for (Proxy proxy : proxies) {
            InetSocketAddress addr = (InetSocketAddress) proxy.address();
            System.out.println("  Type: " + proxy.type() + ", Host: " + addr.getHostString() + ", Port: " + addr.getPort());
        }
    }
}
