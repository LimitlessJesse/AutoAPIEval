import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Inet6Address_5 {
    public static void main(String[] args) {
        try {
            Inet6Address inet6Address = (Inet6Address) InetAddress.getByName("fe80::1");
            boolean isSiteLocal = inet6Address.isSiteLocalAddress();
            System.out.println("Is site local address: " + isSiteLocal);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
