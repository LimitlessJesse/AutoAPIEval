import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_4 {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getByName("www.google.com");
            String hostAddress = inetAddress.getHostAddress();
            System.out.println("The IP address of www.google.com is: " + hostAddress);
        } catch (UnknownHostException e) {
            System.out.println("Unknown host: www.google.com");
        }
    }
}
