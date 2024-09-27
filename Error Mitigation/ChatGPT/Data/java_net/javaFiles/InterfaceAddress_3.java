import java.net.InterfaceAddress;
import java.net.InetAddress;

public class InterfaceAddress_3 {
    public static void main(String[] args) {
        InterfaceAddress address1 = new InterfaceAddress(InetAddress.getLoopbackAddress(), 24, InetAddress.getLoopbackAddress());
        InterfaceAddress address2 = new InterfaceAddress(InetAddress.getLoopbackAddress(), 24, InetAddress.getLoopbackAddress());
        
        boolean result = address1.equals(address2);
        System.out.println("Are the addresses equal? " + result);
    }
}
