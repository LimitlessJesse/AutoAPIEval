import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Inet4Address_2 {
    public static void main(String[] args) {
        try {
            Inet4Address address = (Inet4Address) InetAddress.getLocalHost();
            boolean isLocal = address.isAnyLocalAddress();
            System.out.println("Is this a local address? " + isLocal);
        } catch (UnknownHostException e) {
            System.out.println("Unknown Host Exception: " + e.getMessage());
        }
    }
}
