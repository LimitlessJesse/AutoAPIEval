import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_3 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            byte[] ip = address.getAddress();
            for (byte b : ip) {
                System.out.print((b & 0xFF) + ".");
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
