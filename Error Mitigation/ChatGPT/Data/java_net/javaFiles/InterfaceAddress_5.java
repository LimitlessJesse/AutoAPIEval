import java.net.InterfaceAddress;
import java.net.InetAddress;

public class InterfaceAddress_5 {
    public static void main(String[] args) {
        try {
            InterfaceAddress interfaceAddress = new InterfaceAddress(InetAddress.getLocalHost(), 24);
            System.out.println(interfaceAddress.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
