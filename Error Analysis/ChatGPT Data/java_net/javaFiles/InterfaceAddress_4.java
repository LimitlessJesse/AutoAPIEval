import java.net.InterfaceAddress;
import java.net.InetAddress;
import java.util.List;

public class InterfaceAddress_4 {
    public static void main(String[] args) {
        List<InterfaceAddress> interfaceAddresses = InetAddress.getByName("127.0.0.1").getInterfaceAddresses();
        
        for (InterfaceAddress interfaceAddress : interfaceAddresses) {
            int hashCode = interfaceAddress.hashCode();
            System.out.println("HashCode of InterfaceAddress: " + hashCode);
        }
    }
}
