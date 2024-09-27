import java.net.InetAddress;
import java.net.UnknownHostException;

public class Inet4Address_4 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            if (address instanceof java.net.Inet4Address) {
                boolean isLoopback = ((java.net.Inet4Address) address).isLoopbackAddress();
                System.out.println("Is loopback address: " + isLoopback);
            } else {
                System.out.println("Not an IPv4 address");
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
