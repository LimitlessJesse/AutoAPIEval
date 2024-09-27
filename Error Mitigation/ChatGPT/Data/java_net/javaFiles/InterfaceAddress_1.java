import java.net.InetAddress;
import java.net.InterfaceAddress;

public class InterfaceAddress_1 {
    public static void main(String[] args) {
        InterfaceAddress interfaceAddress = new InterfaceAddress();
        InetAddress address = interfaceAddress.getAddress();
        System.out.println("InetAddress for this address: " + address);
    }
}
