import java.net.Proxy;
import java.net.InetSocketAddress;

public class Proxy_3 {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy.example.com", 8080));
        System.out.println(proxy.toString());
    }
}
