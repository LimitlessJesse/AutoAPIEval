import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_3 {
    public static void main(String[] args) {
        try {
            InetAddress myIP = InetAddress.getLocalHost();
            String hostname = myIP.getHostName();
            System.out.println("Hostname: " + hostname);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
