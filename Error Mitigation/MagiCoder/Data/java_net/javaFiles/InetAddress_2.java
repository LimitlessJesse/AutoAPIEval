import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_2 {
    public static void main(String[] args) {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Host Address: " + localHost.getHostAddress());
            System.out.println("Local Host Name: " + localHost.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
