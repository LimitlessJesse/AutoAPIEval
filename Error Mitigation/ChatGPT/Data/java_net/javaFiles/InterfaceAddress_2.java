import java.net.InterfaceAddress;
import java.util.List;

public class InterfaceAddress_2 {
    public static void main(String[] args) {
        List<InterfaceAddress> interfaceAddresses = new ArrayList<>();
        
        // Assuming interfaceAddresses list is populated with InterfaceAddress objects
        
        for (InterfaceAddress interfaceAddress : interfaceAddresses) {
            short prefixLength = interfaceAddress.getNetworkPrefixLength();
            System.out.println("Network Prefix Length: " + prefixLength);
        }
    }
}
