import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_3 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            System.out.println("IP Address: " + address.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Unknown host");
        }
    }
}
