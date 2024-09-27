import java.net.Proxy;

public class Proxy_5 {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new java.net.InetSocketAddress("proxy.example.com", 8080));
        int hashCode = proxy.hashCode();
        System.out.println("Hash code for the proxy: " + hashCode);
    }
}
