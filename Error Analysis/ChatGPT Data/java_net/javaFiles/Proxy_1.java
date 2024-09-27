import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;

public class Proxy_1 {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy.example.com", 8080));
        SocketAddress address = proxy.address();
        System.out.println("Proxy address: " + address.toString());
    }
}
