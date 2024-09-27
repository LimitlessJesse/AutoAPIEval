import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_2 {
    public static void main(String[] args) {
        try {
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("Local Host: " + localhost);
        } catch (UnknownHostException e) {
            System.err.println("Unable to retrieve local host address.");
        }
    }
}
