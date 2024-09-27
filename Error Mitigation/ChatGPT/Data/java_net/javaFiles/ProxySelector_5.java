import java.net.ProxySelector;

public class ProxySelector_5 {
    public static void main(String[] args) {
        ProxySelector proxySelector = ProxySelector.getDefault();
        System.out.println("System-wide ProxySelector: " + proxySelector);
    }
}
