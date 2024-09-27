import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.util.List;

public class NetworkInterface_2 {
    public static void main(String[] args) {
        try {
            NetworkInterface networkInterface = NetworkInterface.getByName("eth0");
            List<InterfaceAddress> interfaceAddresses = networkInterface.getInterfaceAddresses();

            for (InterfaceAddress addr : interfaceAddresses) {
                System.out.println("Address: " + addr.getAddress());
                System.out.println("Network prefix length: " + addr.getNetworkPrefixLength());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
