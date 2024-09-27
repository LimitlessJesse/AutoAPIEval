import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Inet4Address_1 {
    public static void main(String[] args) {
        try {
            Inet4Address inet4Address = (Inet4Address) InetAddress.getByName("www.google.com");
            String hostAddress = inet4Address.getHostAddress();
            System.out.println("Host Address: " + hostAddress);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
