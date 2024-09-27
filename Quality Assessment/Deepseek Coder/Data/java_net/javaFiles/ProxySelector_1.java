import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.util.List;

public class ProxySelector_1 {
    public static void main(String[] args) throws Exception {
        URI uri = new URI("http://example.com");
        ProxySelector selector = ProxySelector.getDefault();
        List<Proxy> proxies = selector.select(uri);
        for (Proxy proxy : proxies) {
            System.out.println(proxy.type() + ": " + proxy.address());
        }
    }
}
