import java.net.Proxy;
import java.net.InetSocketAddress;

public class Proxy_4 {
    public static void main(String[] args) {
        Proxy proxy1 = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy.example.com", 8080));
        Proxy proxy2 = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy.example.com", 8080));
        
        boolean result = proxy1.equals(proxy2);
        System.out.println("Are proxy1 and proxy2 equal? " + result);
    }
}
