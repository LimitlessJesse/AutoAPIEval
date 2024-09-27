import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_4 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("Host Name: " + address.getHostName());
        } catch (UnknownHostException e) {
            System.err.println("Unable to get host name");
        }
    }
}
