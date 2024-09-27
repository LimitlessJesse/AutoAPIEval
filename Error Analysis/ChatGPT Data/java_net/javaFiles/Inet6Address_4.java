import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Inet6Address_4 {
    public static void main(String[] args) {
        try {
            Inet6Address address = (Inet6Address) InetAddress.getByName("::1");
            System.out.println(address.isLoopbackAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
