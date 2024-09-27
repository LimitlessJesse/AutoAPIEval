import java.net.InetSocketAddress;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetSocketAddress_3 {
    public static void main(String[] args) {
        try {
            InetSocketAddress socketAddress = new InetSocketAddress("localhost", 8080);
            InetAddress address = socketAddress.getAddress();
            System.out.println("InetAddress: " + address);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
