import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_4 {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getByName("www.google.com");
            String ipAddress = inetAddress.getHostAddress();
            System.out.println("IP Address: " + ipAddress);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
