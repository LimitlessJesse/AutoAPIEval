import java.net.InetSocketAddress;
import java.net.InetAddress;
import java.io.IOException;

public class InetSocketAddress_4 {
    public static void main(String[] args) {
        try {
            InetSocketAddress socketAddress = new InetSocketAddress("www.google.com", 80);
            InetAddress address = socketAddress.getAddress();
            System.out.println("IP Address: " + address.getHostAddress());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
