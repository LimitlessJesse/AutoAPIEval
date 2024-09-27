import java.net.NetworkInterface;
import java.net.InetAddress;
import java.util.Enumeration;

public class NetworkInterface_2 {
    public static void main(String[] args) {
        try {
            NetworkInterface networkInterface = NetworkInterface.getByName("eth0");
            Enumeration<InetAddress> addresses = networkInterface.getInetAddresses();
            
            while (addresses.hasMoreElements()) {
                InetAddress address = addresses.nextElement();
                System.out.println(address.getHostAddress());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
