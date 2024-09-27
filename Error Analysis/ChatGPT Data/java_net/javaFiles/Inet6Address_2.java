import java.net.Inet6Address;

public class Inet6Address_2 {
    public static void main(String[] args) {
        try {
            Inet6Address address = (Inet6Address) Inet6Address.getByName("localhost");
            System.out.println("Host Address: " + address.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
