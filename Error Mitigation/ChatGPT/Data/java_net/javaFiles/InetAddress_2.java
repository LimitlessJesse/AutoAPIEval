import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_2 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            byte[] rawAddress = address.getAddress();
            System.out.print("Raw IP Address: ");
            for (byte b : rawAddress) {
                System.out.print((b & 0xFF) + ".");
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
