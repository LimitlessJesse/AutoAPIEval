import java.net.InetAddress;
import java.io.IOException;

public class InetAddress_5 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            boolean reachable = address.isReachable(5000); // timeout of 5 seconds
            System.out.println("Is reachable: " + reachable);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
