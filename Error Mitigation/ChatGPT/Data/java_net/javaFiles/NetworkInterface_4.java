import java.net.NetworkInterface;
import java.net.SocketException;

public class NetworkInterface_4 {
    public static void main(String[] args) {
        try {
            NetworkInterface networkInterface = NetworkInterface.getByName("eth0");
            boolean isLoopback = networkInterface.isLoopback();
            System.out.println("Is loopback interface: " + isLoopback);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
