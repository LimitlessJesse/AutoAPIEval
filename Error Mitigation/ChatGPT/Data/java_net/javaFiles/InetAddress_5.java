import java.net.InetAddress;
import java.io.IOException;

public class InetAddress_5 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            boolean isReachable = address.isReachable(5000); // Timeout set to 5 seconds
            System.out.println("Is reachable: " + isReachable);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
