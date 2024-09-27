import java.net.Inet4Address;
import java.net.UnknownHostException;

public class Inet4Address_3 {
    public static void main(String[] args) {
        try {
            Inet4Address address = (Inet4Address) Inet4Address.getByName("169.254.0.1");
            System.out.println(address.isLinkLocalAddress()); // Output: true
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
