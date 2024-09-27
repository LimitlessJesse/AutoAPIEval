import java.net.InterfaceAddress;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.List;

public class InterfaceAddress_2 {
    public static void main(String[] args) {
        try {
            List<InterfaceAddress> interfaceAddresses = NetworkInterface.getByInetAddress(InetAddress.getLocalHost()).getInterfaceAddresses();
            for (InterfaceAddress ia : interfaceAddresses) {
                System.out.println("Network Prefix Length: " + ia.getNetworkPrefixLength());
            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
