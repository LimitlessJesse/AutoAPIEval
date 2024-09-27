import java.net.Proxy;

public class Proxy_1 {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new java.net.InetSocketAddress("proxy.example.com", 8080));
        Proxy.Type proxyType = proxy.type();
        System.out.println("Proxy Type: " + proxyType);
    }
}
