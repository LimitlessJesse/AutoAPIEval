import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Inet6Address_5 {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = Inet6Address.getByName("2001:0db8:85a3:0000:0000:8a2e:0370:7334");
            byte[] address = inetAddress.getAddress();
            for (byte b : address) {
                System.out.print(b + " ");
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
