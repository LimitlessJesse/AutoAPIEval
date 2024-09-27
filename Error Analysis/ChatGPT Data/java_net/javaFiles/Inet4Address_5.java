import java.net.Inet4Address;
import java.net.UnknownHostException;

public class Inet4Address_5 {
    public static void main(String[] args) {
        try {
            Inet4Address address = (Inet4Address) Inet4Address.getByName("224.0.0.1");
            boolean isMulticast = address.isMulticastAddress();
            System.out.println("Is multicast address: " + isMulticast);
        } catch (UnknownHostException e) {
            System.out.println("Unknown Host Exception: " + e.getMessage());
        }
    }
}
