import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;

public class Proxy_4 {
    public static void main(String[] args) {
        // Create a proxy
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy.example.com", 8080));

        // Get the SocketAddress of the proxy
        SocketAddress socketAddress = proxy.address();

        // Print the SocketAddress
        System.out.println(socketAddress);
    }
}
