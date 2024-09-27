import java.net.InterfaceAddress;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.List;

public class InterfaceAddress_5 {
    public static void main(String[] args) throws Exception {
        NetworkInterface networkInterface = NetworkInterface.getByName("en0");
        List<InterfaceAddress> interfaceAddresses = networkInterface.getInterfaceAddresses();
        
        for (InterfaceAddress interfaceAddress : interfaceAddresses) {
            System.out.println(interfaceAddress.toString());
        }
    }
}
