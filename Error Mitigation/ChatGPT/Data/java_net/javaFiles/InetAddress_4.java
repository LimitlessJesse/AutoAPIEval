import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_4 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            String hostName = address.getHostName();
            System.out.println("Host Name: " + hostName);
        } catch (UnknownHostException e) {
            System.out.println("Unknown Host");
        }
    }
}
