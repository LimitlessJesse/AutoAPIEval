import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Inet6Address_3 {
    public static void main(String[] args) {
        try {
            InetAddress addr = InetAddress.getByName("fe80::1");
            if (addr instanceof Inet6Address) {
                Inet6Address ipv6Address = (Inet6Address) addr;
                boolean isLinkLocal = ipv6Address.isLinkLocalAddress();
                System.out.println("Is Link Local Address: " + isLinkLocal);
            } else {
                System.out.println("Not an IPv6 address");
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
