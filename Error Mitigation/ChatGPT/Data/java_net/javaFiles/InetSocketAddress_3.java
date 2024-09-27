import java.net.InetSocketAddress;
import java.net.InetAddress;

public class InetSocketAddress_3 {
    public static void main(String[] args) {
        InetSocketAddress address = new InetSocketAddress("localhost", 8080);
        InetAddress inetAddress = address.getAddress();
        
        System.out.println("InetAddress: " + inetAddress);
    }
}
