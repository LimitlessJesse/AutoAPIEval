import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.util.List;

public class ProxySelector_1 {
    public static void main(String[] args) {
        ProxySelector proxySelector = ProxySelector.getDefault();
        URI uri = URI.create("http://www.example.com");
        List<Proxy> proxies = proxySelector.select(uri);
        
        for (Proxy proxy : proxies) {
            System.out.println(proxy);
        }
    }
}
