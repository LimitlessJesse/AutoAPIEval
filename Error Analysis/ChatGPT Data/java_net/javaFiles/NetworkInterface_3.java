import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class NetworkInterface_3 {
    public static void main(String[] args) {
        try {
            NetworkInterface networkInterface = NetworkInterface.getByName("en0");
            Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
            
            while (inetAddresses.hasMoreElements()) {
                InetAddress address = inetAddresses.nextElement();
                System.out.println("Host Address: " + address.getHostAddress());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
