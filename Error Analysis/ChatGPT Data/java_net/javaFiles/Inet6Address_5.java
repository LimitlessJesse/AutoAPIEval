import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Inet6Address_5 {
    public static void main(String[] args) {
        try {
            Inet6Address inet6Address = (Inet6Address) InetAddress.getByName("2001:db8:85a3:8d3:1319:8a2e:370:7348");
            byte[] address = inet6Address.getAddress();
            System.out.print("IPv6 Address: ");
            for (byte b : address) {
                System.out.print(Integer.toHexString(b & 0xFF) + ":");
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
