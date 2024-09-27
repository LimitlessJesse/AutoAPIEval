import java.net.ProxySelector;

public class ProxySelector_3 {
    public static void main(String[] args) {
        ProxySelector proxySelector = ProxySelector.getDefault();
        System.out.println(proxySelector);
    }
}
