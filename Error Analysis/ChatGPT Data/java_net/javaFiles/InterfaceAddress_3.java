import java.net.InterfaceAddress;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.List;

public class InterfaceAddress_3 {
    public static void main(String[] args) {
        try {
            List<InterfaceAddress> interfaceAddresses = InetAddress.getByName("localhost").getInterfaceAddresses();
            InterfaceAddress firstInterfaceAddress = interfaceAddresses.get(0);
            InterfaceAddress secondInterfaceAddress = interfaceAddresses.get(1);

            System.out.println("Are the first and second Interface Addresses equal? " + firstInterfaceAddress.equals(secondInterfaceAddress));
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
