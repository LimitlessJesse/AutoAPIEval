import java.net.Inet6Address;
import java.net.InetAddress;

public class Inet6Address_3 {
    public static void main(String[] args) {
        try {
            Inet6Address inet6Address = (Inet6Address) InetAddress.getByName("::");
            boolean isAnyLocal = inet6Address.isAnyLocalAddress();
            System.out.println("Is any local address: " + isAnyLocal);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
