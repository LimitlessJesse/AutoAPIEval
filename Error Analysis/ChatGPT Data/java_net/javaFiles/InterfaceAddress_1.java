import java.net.InterfaceAddress;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.List;

public class InterfaceAddress_1 {
    public static void main(String[] args) {
        try {
            NetworkInterface networkInterface = NetworkInterface.getByName("en0");
            List<InterfaceAddress> interfaceAddresses = networkInterface.getInterfaceAddresses();
            
            for (InterfaceAddress interfaceAddress : interfaceAddresses) {
                InetAddress address = interfaceAddress.getAddress();
                System.out.println("Address: " + address.getHostAddress());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
