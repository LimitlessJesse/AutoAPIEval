import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_5 {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getByName("www.google.com");
            boolean reachable = inetAddress.isReachable(1000);
            System.out.println("Is reachable: " + reachable);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
