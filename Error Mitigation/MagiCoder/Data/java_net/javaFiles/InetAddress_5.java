import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_5 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            System.out.println("Is reachable: " + address.isReachable(5000));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
