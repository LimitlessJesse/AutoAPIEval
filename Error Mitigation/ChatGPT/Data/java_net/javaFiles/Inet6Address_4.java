import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Inet6Address_4 {
    public static void main(String[] args) {
        try {
            Inet6Address inet6Address = (Inet6Address) InetAddress.getByName("fe80::1");
            boolean isLinkLocal = inet6Address.isLinkLocalAddress();
            System.out.println("Is Link Local Address: " + isLinkLocal);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
