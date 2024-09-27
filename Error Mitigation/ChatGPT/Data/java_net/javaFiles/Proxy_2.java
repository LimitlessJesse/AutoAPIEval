import java.net.Proxy;
import java.net.SocketAddress;

public class Proxy_2 {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new SocketAddress() {
            @Override
            public String toString() {
                return "Proxy Socket Address";
            }
        });
        
        SocketAddress address = proxy.address();
        System.out.println(address);
    }
}
